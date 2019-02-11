package com.devwarriors.mapfood.mapa;

import com.devwarriors.mapfood.model.Entregador;
import com.devwarriors.mapfood.model.Pedido;
import com.devwarriors.mapfood.repository.ProcessamentoRotaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GerenciadorRota {

	@Autowired
	private ProcessamentoRotaRepository processamentoRotaRepository;

	@Autowired
	private ProblemaRotaIndividualService problemaRotaIndividualService;

	public GerenciadorRota() {}

	public void enviaProblemaDeRotaParaCalcular(Pedido pedido, List<Entregador> entregadores) {

	    ProcessamentoRota processamentoRota = new ProcessamentoRota(pedido, entregadores);

		//apagar
		ProblemaRotaIndividualService problemaRotaIndividualService = new ProblemaRotaIndividualService();

		for (Entregador entregador : entregadores) {
			ProblemaRotaIndividual problemaRota = new ProblemaRotaIndividual(pedido, entregador);
			ProblemaRotaIndividualDto problemaRotaIndividualDto = problemaRotaIndividualService.converteParaDto(problemaRota);

			String problemaId = problemaRotaIndividualService.enviaProblemaRota(problemaRotaIndividualDto);

			if (problemaId != null)
			    processamentoRota.adicionaIdProblemaEmProcessamento(problemaId);
		}

		processamentoRotaRepository.save(processamentoRota);
	}

	public SolucaoRota getMelhorSolucao() {
        return new SolucaoRota();
    }

	public void retornaSolucaoDeRota(Pedido pedido) {

        List<SolucaoRota> solucoes = new ArrayList<>();

        Optional<ProcessamentoRota> processamentoRota = processamentoRotaRepository
                .findByPedidoPedidoId(pedido.getPedidoId());

        if (!processamentoRota.isPresent())
            throw new RuntimeException("Processamento de rota não encontrada.");

		for (String problemaId : processamentoRota.get().getProblemas()) {
			SolucaoRota solucaoRota = problemaRotaIndividualService.obterSolucao(problemaId);
			solucoes.add(solucaoRota);
		}
	}
}