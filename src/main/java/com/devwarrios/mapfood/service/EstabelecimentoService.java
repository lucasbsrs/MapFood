package com.devwarrios.mapfood.service;

import com.devwarrios.mapfood.exception.EstabelecimentoException;
import com.devwarrios.mapfood.model.Estabelecimento;
import com.devwarrios.mapfood.model.Relatorio;
import com.devwarrios.mapfood.repository.EstabelecimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class EstabelecimentoService {

	@Autowired
	private EstabelecimentoRepository estabelecimentoRepository;

	@Autowired
	private RelatorioService relatorioService;


	public Estabelecimento buscaEstabelecimentoPorId(String id) throws EstabelecimentoException {

		Optional<Estabelecimento> estabelecimento = estabelecimentoRepository.findById(id);

		if (!estabelecimento.isPresent())
			throw new EstabelecimentoException("Estabelecimento não encontrado.");

		return estabelecimento.get();

	}

	public Relatorio geraRelatorio(String id, LocalDate dataInicial, LocalDate dataFinal) {
		return relatorioService.geraRelatorio(id, dataInicial, dataFinal);
	}

}
