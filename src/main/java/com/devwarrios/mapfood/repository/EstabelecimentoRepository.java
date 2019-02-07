package com.devwarrios.mapfood.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.devwarrios.mapfood.model.Estabelecimento;
import org.springframework.stereotype.Repository;

@Repository
public interface EstabelecimentoRepository extends MongoRepository<Estabelecimento, String> {
	public List<Estabelecimento> findByEstabelecimentoId(String estabelecimentoId);
}
