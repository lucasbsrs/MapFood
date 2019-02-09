package com.devwarrios.mapfood.utils;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.stereotype.Component;

import com.devwarrios.mapfood.model.Estabelecimento;
import com.devwarrios.mapfood.model.Produto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Component
@NoArgsConstructor
@AllArgsConstructor
public class GerenciadorEstabelecimento {

	private Estabelecimento estabelecimento;
	
	public Stream<Produto> buscarStreamProdutos() {
		return this.estabelecimento.getProdutos().stream();
	}
	
	public Produto buscaProdutoPorId(String id) {
		return this.buscarStreamProdutos().filter(p -> p.getProdutoId().equals(id)).findFirst().orElse(null);
	}

	public Stream<Produto> buscarProdutosPorId(List<String> itensIds) {
		return this.buscarStreamProdutos().filter(p -> itensIds.contains(p.getProdutoId()));
	}
}
