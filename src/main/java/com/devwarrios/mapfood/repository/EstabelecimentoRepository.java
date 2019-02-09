package com.devwarrios.mapfood.repository;

import com.devwarrios.mapfood.model.Estabelecimento;
import org.springframework.data.geo.Distance;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EstabelecimentoRepository extends MongoRepository<Estabelecimento, String> {
	public List<Estabelecimento> findByEstabelecimentoId(String estabelecimentoId);

    List<Estabelecimento> findAllByLocalizacaoNear(GeoJsonPoint point, Distance distance);

    //db.clientes.find({ localizacao: { $nearSphere: { $geometry: { type: "Point", coordinates: [ -51.136677,-30.078246 ] }, $maxDistance: 5 * 1500 } } })
}
