package com.devwarriors.mapfood.service;

import com.devwarriors.mapfood.dto.ProblemaRotaDto;
import com.devwarriors.mapfood.model.Entregador;
import com.devwarriors.mapfood.model.GerenciadorRota;
import com.devwarriors.mapfood.model.ProblemaRota;
import com.devwarriors.mapfood.repository.GerenciadorRotaRepository;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorRotaService {

	@Autowired
	private GerenciadorRotaRepository gerenciadorRotaRepository;

	@Autowired
	private ProblemaRotaService problemaRotaService;

	private GerenciadorRota gerenciadorRota;

	private List<SolucaoRota> solucoes = new ArrayList<>();

	public GerenciadorRotaService(GerenciadorRota gerenciadorRota) {
		this.gerenciadorRota = gerenciadorRota;
	}

	public void enviaProblemaRotaParaCalcular() {

		//apagar
		ProblemaRotaService problemaRotaService = new ProblemaRotaService();

		for (Entregador entregador : gerenciadorRota.getEntregadores()) {
			ProblemaRota problemaRota = new ProblemaRota(gerenciadorRota.getPedido(), entregador);
			ProblemaRotaDto problemaRotaDto = problemaRotaService.converteParaDto(problemaRota);

			System.out.println(new Gson().toJson(problemaRotaDto));

			String problemaId = problemaRotaService.enviaProblemaRota(problemaRotaDto);
			gerenciadorRota.getProblemas().add(problemaId);
		}

		gerenciadorRotaRepository.save(gerenciadorRota);
	}

	public void obterSolucoes() {

		for (String problemaId : gerenciadorRota.getProblemas()) {
			SolucaoRota solucaoRota = problemaRotaService.obterSolucao(problemaId);
			solucoes.add(solucaoRota);
		}
	}
}