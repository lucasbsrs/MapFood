package com.devwarrios.mapfood.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.devwarrios.mapfood.model.Produto;

public interface ProdutoRepository extends MongoRepository<Produto, String> {
	public List<Produto> findByProdutoId(String produtoId);
}
