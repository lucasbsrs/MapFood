package com.devwarrios.mapfood.service;

import com.devwarrios.mapfood.model.Relatorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class EstabelecimentoService {

	@Autowired
	private RelatorioService relatorioService;

	public Relatorio geraRelatorio(String id, LocalDate dataInicial, LocalDate dataFinal) {
		return relatorioService.geraRelatorio(id, dataInicial, dataFinal);
	}

}
