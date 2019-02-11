package com.devwarriors.mapfood.service;

import com.devwarriors.mapfood.dto.ProblemaRotaDto;
import com.devwarriors.mapfood.model.Entregador;
import com.devwarriors.mapfood.model.GerenciadorRota;
import com.devwarriors.mapfood.model.ProblemaRota;
import com.devwarriors.mapfood.repository.GerenciadorRotaRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class GerenciadorRotaService {

	@Autowired
	private GerenciadorRotaRepository gerenciadorRotaRepository;

	@Autowired
	private ProblemaRotaService problemaRotaService;

	private GerenciadorRota gerenciadorRota;

	public GerenciadorRotaService(GerenciadorRota gerenciadorRota) {
		this.gerenciadorRota = gerenciadorRota;
	}

	public void enviaProblemaRotaACalcular() {

		for (Entregador entregador : gerenciadorRota.getEntregadores()) {
			ProblemaRota problemaRota = new ProblemaRota(gerenciadorRota.getPedido(), entregador);
			ProblemaRotaDto problemaRotaDto = problemaRotaService.converteParaDto(problemaRota);
			String problemaId = problemaRotaService.enviaProblemaRota(problemaRotaDto);
			gerenciadorRota.getProblemas().add(problemaId);
		}
	}

	public void obterSolcaoes() {

		for (String problemaId : gerenciadorRota.getProblemas()) {
			problemaRotaService.obterSolucao(problemaId);
		}
	}
}