package com.devwarrios.mapfood.repository;

import java.util.List;

import com.mongodb.client.model.geojson.Point;
import org.springframework.data.geo.Distance;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.devwarrios.mapfood.model.Estabelecimento;
import org.springframework.stereotype.Repository;

@Repository
public interface EstabelecimentoRepository extends MongoRepository<Estabelecimento, String> {
	public List<Estabelecimento> findByEstabelecimentoId(String estabelecimentoId);
	public List<Estabelecimento> findAllByLocationNear(GeoJsonPoint p, Distance d);
}
