package com.devwarriors.mapfood.mapa;

import com.devwarriors.mapfood.mapa.enums.ModoCalculoRota;
import org.springframework.stereotype.Service;

@Service
public class ProblemaRotaIndividualService {


	private MapLinkApi mapLinkApi;

	public ProblemaRotaIndividualService() {
		mapLinkApi = new MapLinkApi();
	}

	public ProblemaRotaIndividualService(MapLinkApi mapLinkApi) {
		this.mapLinkApi = mapLinkApi;
	}

	public ProblemaRotaIndividualDto converteParaDto(ProblemaRotaIndividual problemaRota) {

		ProblemaRotaIndividualDto problemaRotaIndividualDto = new ProblemaRotaIndividualDto();
		problemaRotaIndividualDto.setCalculationMode(ModoCalculoRota.THE_FASTEST);
		problemaRotaIndividualDto.preencheRotas(problemaRota);

		return problemaRotaIndividualDto;
	}

	public String enviaProblemaRota(ProblemaRotaIndividualDto problemaRotaIndividualDto) {
		return mapLinkApi.criaProblemaDeRota(problemaRotaIndividualDto);
	}

	public SolucaoRota obterSolucao(String problemaId) {

		return mapLinkApi.retornaSolucaoDeRotaPorId(problemaId);

	}
}
