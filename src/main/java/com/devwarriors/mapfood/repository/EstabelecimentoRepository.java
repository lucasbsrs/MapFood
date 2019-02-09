package com.devwarriors.mapfood.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.devwarriors.mapfood.model.Estabelecimento;

import java.util.List;

public interface EstabelecimentoRepository extends MongoRepository<Estabelecimento, String> {
	List<Estabelecimento> findByEstabelecimentoId(String estabelecimentoId);

}
