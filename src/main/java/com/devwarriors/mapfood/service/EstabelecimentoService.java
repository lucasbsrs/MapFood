package com.devwarriors.mapfood.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devwarriors.mapfood.exception.EstabelecimentoException;
import com.devwarriors.mapfood.model.Estabelecimento;
import com.devwarriors.mapfood.model.Relatorio;
import com.devwarriors.mapfood.repository.EstabelecimentoRepository;

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
