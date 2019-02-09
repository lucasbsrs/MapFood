package com.devwarrios.mapfood.utils;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.geo.Distance;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.stereotype.Component;

import com.devwarrios.mapfood.model.Entregador;
import com.devwarrios.mapfood.repository.EntregadorRepository;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Component
@NoArgsConstructor
@AllArgsConstructor
public class GerenciadorEntrega {

	// private Entrega entrega;
	// private Distance distanciaMaxima = new Distance(5000); // 5 km.

	private EntregadorRepository entregadorRepository;

	public Entregador buscaEntregadorDisponivelMaisProximo(GeoJsonPoint p, int capacidadeNecessaria) {
		System.out.println(p);

		if (entregadorRepository == null) {
			System.out.println("null");
		}

		List<Entregador> entregadores = entregadorRepository
				.findByLocalizacaoNearAndCapacidadeDisponivelGreaterThanEqual(p, new Distance(5000),
						capacidadeNecessaria);

		System.out.println("entregadores: " + entregadores);

		return this.entregadorRepository.findByLocalizacaoNearAndCapacidadeDisponivelGreaterThanEqual(p,
				new Distance(5000), capacidadeNecessaria).get(0);
	}
}
