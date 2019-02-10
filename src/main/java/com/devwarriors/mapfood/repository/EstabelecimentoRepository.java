package com.devwarriors.mapfood.repository;

import org.springframework.data.geo.Distance;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.devwarriors.mapfood.model.Estabelecimento;

import java.util.List;

public interface EstabelecimentoRepository extends MongoRepository<Estabelecimento, String> {
	List<Estabelecimento> findByEstabelecimentoId(String estabelecimentoId);

    List<Estabelecimento> findAllByLocalizacaoNear(GeoJsonPoint point, Distance distance);
}
