package com.devwarrios.mapfood.repository;

import java.util.List;

import org.springframework.data.geo.Distance;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.devwarrios.mapfood.model.Entregador;

public interface EntregadorRepository extends MongoRepository<Entregador, String>{
	List<Entregador> findByPositionNear(GeoJsonPoint p, Distance d);
}
