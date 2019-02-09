package com.devwarriors.mapfood.repository;

import java.util.List;

import com.devwarriors.mapfood.model.Produto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProdutoRepository extends MongoRepository<Produto, String> {
	public List<Produto> findByProdutoId(String produtoId);
}
