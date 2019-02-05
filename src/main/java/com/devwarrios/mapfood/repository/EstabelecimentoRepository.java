package com.devwarrios.mapfood.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.devwarrios.mapfood.model.Estabelecimento;

public interface EstabelecimentoRepository extends MongoRepository<Estabelecimento, Long> {
	public List<Estabelecimento> findByEstabelecimentoId(String estabelecimentoId);
}
