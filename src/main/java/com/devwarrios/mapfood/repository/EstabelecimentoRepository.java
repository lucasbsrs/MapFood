package com.devwarrios.mapfood.repository;

import com.devwarrios.mapfood.model.Estabelecimento;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface EstabelecimentoRepository extends MongoRepository<Estabelecimento, String> {
	List<Estabelecimento> findByEstabelecimentoId(String estabelecimentoId);

}
