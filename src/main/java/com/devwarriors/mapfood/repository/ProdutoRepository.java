package com.devwarriors.mapfood.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.devwarriors.mapfood.model.Produto;

public interface ProdutoRepository extends MongoRepository<Produto, String> {
	public List<Produto> findByProdutoId(String produtoId);
}
