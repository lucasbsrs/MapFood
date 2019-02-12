package com.devwarriors.mapfood.repository;

import java.util.List;

import org.springframework.data.geo.Distance;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.devwarriors.mapfood.model.Estabelecimento;

public interface EstabelecimentoRepository extends MongoRepository<Estabelecimento, String> {

	public List<Estabelecimento> findByEstabelecimentoId(String estabelecimentoId);

	public boolean existsByEstabelecimentoId(String estabelecimentoId);

	public List<Estabelecimento> findAllByLocalizacaoNear(GeoJsonPoint point, Distance distance);
}
