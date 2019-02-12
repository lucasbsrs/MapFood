package com.devwarriors.mapfood.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.geo.Distance;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.stereotype.Service;

import com.devwarriors.mapfood.model.Entregador;
import com.devwarriors.mapfood.repository.EntregadorRepository;

@Service
public class EntregadorService {

	@Autowired
	private EntregadorRepository entregadorRepository;

	private Distance distanciaMaxima = new Distance(5000);

//	{
//		this.distanciaMaxima = new Distance(5000);
//	}

	public void decrementaCapacidadeDisponivel(String entregadorId, int decremento)
			throws CapacidadeDoEntregadorInvalidaException {
		Entregador entregador = this.entregadorRepository.findByEntregadorId(entregadorId);

		int capacidadeAtual = entregador.getCapacidadeDisponivel();
		if (capacidadeAtual < decremento) {
			throw new CapacidadeDoEntregadorInvalidaException();
		}

		entregador.setCapacidadeDisponivel(entregador.getCapacidadeDisponivel() - decremento);

		this.entregadorRepository.save(entregador);
	}

	public Entregador buscaEntregadorDisponivelMaisProximo(GeoJsonPoint p, int capacidadeNecessaria) {
		return this.buscaEntregadorDisponivelMaisProximoComDistanciaMaxima(p, this.distanciaMaxima,
				capacidadeNecessaria);
	}

	public Entregador buscaEntregadorDisponivelMaisProximoComDistanciaMaxima(GeoJsonPoint p, Distance distanciaMaxima,
			int capacidadeNecessaria) {
		return entregadorRepository
				.findByLocalizacaoNearAndCapacidadeDisponivelGreaterThanEqual(p, distanciaMaxima, capacidadeNecessaria)
				.get(0);
	}
}
