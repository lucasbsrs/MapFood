package com.devwarriors.mapfood.mapa;

import com.devwarriors.mapfood.mapa.enums.ModoCalculoRota;
import com.devwarriors.mapfood.repository.RotaIndividualRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RotaIndividualService {

	@Autowired
	RotaIndividualRepository rotaIndividualRepository;

	private MapLinkApi mapLinkApi;

	public RotaIndividualService() {
		mapLinkApi = new MapLinkApi();
	}

	public RotaIndividualDto converteParaDto(RotaIndividual rotaIndividual) {

		RotaIndividualDto rotaIndividualDto = new RotaIndividualDto();
		rotaIndividualDto.setCalculationMode(ModoCalculoRota.THE_FASTEST);
		rotaIndividualDto.preencheRotas(rotaIndividual);

		return rotaIndividualDto;
	}

	public String enviaProblemaRota(RotaIndividualDto rotaIndividualDto) {
		return mapLinkApi.criaProblemaDeRota(rotaIndividualDto);
	}

	public void salvarRotaIndividual(RotaIndividual rotaIndividual) {
		rotaIndividualRepository.insert(rotaIndividual);
	}

	public SolucaoRota obterSolucao(String problemaId) {
		return mapLinkApi.retornaSolucaoDeRotaPorId(problemaId);
	}
}
