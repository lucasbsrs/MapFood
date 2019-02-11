package com.devwarriors.mapfood.service;

import com.devwarriors.mapfood.dto.ProblemaRotaDto;
import com.devwarriors.mapfood.mapa.MapLinkApi;
import com.devwarriors.mapfood.model.ProblemaRota;

public class ProblemaRotaService {


	private MapLinkApi mapLinkApi;

	public ProblemaRotaService() {
	}

	public ProblemaRotaService(MapLinkApi mapLinkApi) {
		this.mapLinkApi = mapLinkApi;
	}

	public ProblemaRotaDto converteParaDto(ProblemaRota problemaRota) {
		return null;
	}

	public String enviaProblemaRota(ProblemaRotaDto problemaRotaDto) {

		String problemaId = mapLinkApi.postaProblema(problemaRotaDto);

		return problemaId;
	}

	public SolucaoRota obterSolucao(String problemaId) {

		return mapLinkApi.obterSolucao(problemaId);

	}
}
