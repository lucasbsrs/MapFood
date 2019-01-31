package com.devwarrios.mapfood.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.devwarrios.mapfood.model.Produto;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Long> {
	public List<Produto> findByProdutoId(String produtoId);
}
