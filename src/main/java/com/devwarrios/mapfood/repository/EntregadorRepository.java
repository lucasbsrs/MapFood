package com.devwarrios.mapfood.repository;

import java.util.List;

import org.springframework.data.geo.Distance;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.devwarrios.mapfood.model.Entregador;

@Repository
public interface EntregadorRepository extends MongoRepository<Entregador, String> {
	Entregador findByEntregadorId(String id);

	List<Entregador> findByLocalizacaoNearAndCapacidadeDisponivelGreaterThanEqual(GeoJsonPoint centro, Distance raio,
			int capacidadeNecessaria);
}
