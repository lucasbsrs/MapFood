package com.devwarrios.mapfood.service;

import com.devwarrios.mapfood.model.PedidoStatus;
import com.devwarrios.mapfood.model.Relatorio;
import com.devwarrios.mapfood.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class RelatorioService {

	@Autowired
	private PedidoRepository pedidoRepository;


	public Relatorio geraRelatorio(String id, LocalDate dataInicial, LocalDate dataFinal) {

		Long totalEntregaEfetivada = getTotalEntregaEfetivada(id, dataInicial, dataFinal);


		Relatorio relatorio = new Relatorio();
		relatorio.setTotalEntregas(totalEntregaEfetivada);
		relatorio.setTotalQuilometragem(900.0);

		return relatorio;
	}

	private Long getTotalEntregaEfetivada(String id, LocalDate dataInicial, LocalDate dataFinal) {
		return pedidoRepository.countByEstabelecimentoIdAndDataBetweenAndStatus(id, dataInicial, dataFinal, PedidoStatus.ENTREGUE);
	}
}
