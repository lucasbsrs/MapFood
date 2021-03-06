package com.devwarriors.mapfood.mapa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.devwarriors.mapfood.model.Cliente;
import com.devwarriors.mapfood.model.Entregador;
import com.devwarriors.mapfood.model.Estabelecimento;
import com.devwarriors.mapfood.model.Pedido;
import com.devwarriors.mapfood.repository.ProcessamentoRotaRepository;
import com.devwarriors.mapfood.repository.RotaIndividualRepository;

@Component
public class GerenciadorRota {

	@Autowired
	private ProcessamentoRotaRepository processamentoRotaRepository;

	@Autowired
	private RotaIndividualRepository rotaIndividualRepository;

	@Autowired
	private RotaIndividualService rotaIndividualService;

	public GerenciadorRota() {
	}

	public void enviaProblemaDeRotaParaCalcular(Pedido pedido, Estabelecimento estabelecimento,
			List<Entregador> entregadores, Cliente cliente) {

		ProcessamentoRota processamentoRota = new ProcessamentoRota(pedido, entregadores);

		for (Entregador entregador : entregadores) {
			RotaIndividual rotaIndividual = new RotaIndividual(pedido, estabelecimento, entregador, cliente);

			RotaIndividualDto rotaIndividualDto = rotaIndividualService.converteParaDto(rotaIndividual);

			String problemaId = rotaIndividualService.enviaProblemaRota(rotaIndividualDto);

			if (problemaId != null)
				processamentoRota.adicionaIdProblemaEmProcessamento(problemaId);

			rotaIndividual.setProblemaId(problemaId);
			rotaIndividualService.salvarRotaIndividual(rotaIndividual);
		}

		processamentoRotaRepository.insert(processamentoRota);
	}

	private List<SolucaoRota> retornaListaDeSolucoes(Pedido pedido) {
		List<SolucaoRota> solucoes = new ArrayList<>();

		Optional<ProcessamentoRota> processamentoRota = processamentoRotaRepository
				.findByPedidoPedidoId(pedido.getPedidoId());

		if (!processamentoRota.isPresent())
			throw new RuntimeException("Processamento de rota não encontrada.");

		for (String problemaId : processamentoRota.get().getProblemas()) {
			SolucaoRota solucaoRota = rotaIndividualService.obterSolucao(problemaId);
			solucoes.add(solucaoRota);
		}

		return solucoes;
	}

	public SolucaoRota retornaSolucaoDeRotaMenorTempo(Pedido pedido) {
		SolucaoRota solucaoRota = retornaListaDeSolucoes(pedido).stream()
				.min(Comparator.comparingLong(SolucaoRota::getTotalTempoSegundos)).get();

		RotaIndividual rotaIndividualSelecionada = rotaIndividualRepository
				.findRotaIndividualByProblemaId(solucaoRota.getProblemaId());

		solucaoRota.setEntregador(rotaIndividualSelecionada.getEntregador());

		return solucaoRota;
	}

	public SolucaoRota retornaSolucaoDeRotaMenorDistancia(Pedido pedido) {
		return retornaListaDeSolucoes(pedido).stream()
				.min(Comparator.comparingDouble(SolucaoRota::getTotalDistanciaMetros)).get();
	}
}