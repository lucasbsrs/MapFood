package com.devwarriors.mapfood.mapa;

import com.devwarriors.mapfood.model.Entregador;
import com.devwarriors.mapfood.model.Pedido;
import com.devwarriors.mapfood.repository.ProcessamentoRotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Component
public class GerenciadorRota {

    @Autowired
    private ProcessamentoRotaRepository processamentoRotaRepository;

    @Autowired
    private RotaIndividualService rotaIndividualService;

    public GerenciadorRota() {
    }

    public void enviaProblemaDeRotaParaCalcular(Pedido pedido, List<Entregador> entregadores) {

        ProcessamentoRota processamentoRota = new ProcessamentoRota(pedido, entregadores);

        for (Entregador entregador : entregadores) {
            RotaIndividual rotaIndividual = new RotaIndividual(pedido, entregador);
            RotaIndividualDto rotaIndividualDto = rotaIndividualService.converteParaDto(rotaIndividual);

            String problemaId = rotaIndividualService.enviaProblemaRota(rotaIndividualDto);

            if (problemaId != null)
                processamentoRota.adicionaIdProblemaEmProcessamento(problemaId);
        }

        processamentoRotaRepository.save(processamentoRota);
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
        return retornaListaDeSolucoes(pedido).stream()
                .min(Comparator.comparingLong(SolucaoRota::getTotalTempoSegundos))
                .get();
    }

    public SolucaoRota retornaSolucaoDeRotaMenorDistancia(Pedido pedido) {
        return retornaListaDeSolucoes(pedido).stream()
                .min(Comparator.comparingDouble(SolucaoRota::getTotalDistanciaMetros))
                .get();

    }
}