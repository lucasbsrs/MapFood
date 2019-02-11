package com.devwarriors.mapfood.mapa;

import com.devwarriors.mapfood.mapa.enums.ModoCalculoRota;
import org.springframework.stereotype.Service;

@Service
public class ProblemaRotaService {


	private MapLinkApi mapLinkApi;

	public ProblemaRotaService() {
		mapLinkApi = new MapLinkApi();
	}

	public ProblemaRotaService(MapLinkApi mapLinkApi) {
		this.mapLinkApi = mapLinkApi;
	}

	public ProblemaRotaDto converteParaDto(ProblemaRota problemaRota) {

		ProblemaRotaDto problemaRotaDto = new ProblemaRotaDto();
		problemaRotaDto.setCalculationMode(ModoCalculoRota.THE_FASTEST);
		problemaRotaDto.preencheRotas(problemaRota);

		return problemaRotaDto;
	}

	public String enviaProblemaRota(ProblemaRotaDto problemaRotaDto) {
		return mapLinkApi.criaProblemaDeRota(problemaRotaDto);
	}

	public SolucaoRota obterSolucao(String problemaId) {

		return mapLinkApi.retornaSolucaoDeRotaPorId(problemaId);

	}
}
