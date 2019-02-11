package com.devwarriors.mapfood.service;

import com.devwarriors.mapfood.dto.ProblemaRotaDto;
import com.devwarriors.mapfood.mapa.MapLinkApi;
import com.devwarriors.mapfood.model.ProblemaRota;
import com.devwarriors.mapfood.model.enums.ModoCalculoRota;
import org.springframework.stereotype.Service;

@Service
public class ProblemaRotaService {


	private MapLinkApi mapLinkApi;

	public ProblemaRotaService() {
	}

	public ProblemaRotaService(MapLinkApi mapLinkApi) {
		this.mapLinkApi = mapLinkApi;
	}

	public ProblemaRotaDto converteParaDto(ProblemaRota problemaRota) {

		ProblemaRotaDto problemaRotaDto = new ProblemaRotaDto();
		problemaRotaDto.setModoCalculoRota(ModoCalculoRota.THE_FASTEST);
		problemaRotaDto.preencheRotas(problemaRota);

		return problemaRotaDto;
	}

	public String enviaProblemaRota(ProblemaRotaDto problemaRotaDto) {

		String problemaId = mapLinkApi.postaProblema(problemaRotaDto);

		return problemaId;
	}

	public SolucaoRota obterSolucao(String problemaId) {

		return mapLinkApi.obterSolucao(problemaId);

	}
}
