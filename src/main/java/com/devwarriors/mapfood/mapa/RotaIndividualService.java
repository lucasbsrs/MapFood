package com.devwarriors.mapfood.mapa;

import com.devwarriors.mapfood.mapa.enums.ModoCalculoRota;
import org.springframework.stereotype.Service;

@Service
public class RotaIndividualService {

	private MapLinkApi mapLinkApi;

	public RotaIndividualService() {
		mapLinkApi = new MapLinkApi();
	}

	public RotaIndividualService(MapLinkApi mapLinkApi) {
		this.mapLinkApi = mapLinkApi;
	}

	public RotaIndividualDto converteParaDto(RotaIndividual problemaRota) {

		RotaIndividualDto rotaIndividualDto = new RotaIndividualDto();
		rotaIndividualDto.setCalculationMode(ModoCalculoRota.THE_FASTEST);
		rotaIndividualDto.preencheRotas(problemaRota);

		return rotaIndividualDto;
	}

	public String enviaProblemaRota(RotaIndividualDto rotaIndividualDto) {
		return mapLinkApi.criaProblemaDeRota(rotaIndividualDto);
	}

	public SolucaoRota obterSolucao(String problemaId) {
		return mapLinkApi.retornaSolucaoDeRotaPorId(problemaId);
	}
}
