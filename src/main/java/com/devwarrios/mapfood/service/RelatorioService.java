package com.devwarrios.mapfood.service;

import com.devwarrios.mapfood.model.Pedido;
import com.devwarrios.mapfood.model.PedidoStatus;
import com.devwarrios.mapfood.model.Relatorio;
import com.devwarrios.mapfood.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class RelatorioService {

	@Autowired
	private PedidoRepository pedidoRepository;


	public Relatorio geraRelatorio(String id, LocalDate dataInicial, LocalDate dataFinal) {

		Long totalEntregaEfetivada = buscaTotalEntregaEfetivada(id, dataInicial, dataFinal);
		Double totalQuilometragem = buscaTotalQuilometragemPercorrida(id, dataInicial, dataFinal);
		Double totalDuracaoEntrega = buscaTotalDuracaoEntrega(id, dataInicial, dataFinal);

		return new Relatorio(totalEntregaEfetivada, totalQuilometragem, totalDuracaoEntrega);
	}

    private Double buscaTotalDuracaoEntrega(String id, LocalDate dataInicial, LocalDate dataFinal) {
	    return 0.0;
    }

    private Double buscaTotalQuilometragemPercorrida(String id, LocalDate dataInicial, LocalDate dataFinal) {

        List<Pedido> pedidos = pedidoRepository.findAllByEstabelecimentoIdAndDataBetween(id, dataInicial, dataFinal);

        return pedidos.stream()
                .mapToDouble(p -> p.getEntrega().getDistanciaPercorrida())
                .sum();
    }

    private Long buscaTotalEntregaEfetivada(String id, LocalDate dataInicial, LocalDate dataFinal) {
		return pedidoRepository.countByEstabelecimentoIdAndDataBetweenAndStatus(id, dataInicial, dataFinal, PedidoStatus.ENTREGUE);
	}

}
