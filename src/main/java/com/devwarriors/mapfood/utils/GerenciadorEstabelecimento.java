package com.devwarriors.mapfood.utils;

import java.util.List;
import java.util.stream.Stream;

import com.devwarriors.mapfood.service.ProdutoInexistenteException;
import org.springframework.stereotype.Component;

import com.devwarriors.mapfood.model.Estabelecimento;
import com.devwarriors.mapfood.model.Produto;

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

	public Produto buscaProdutoPorId(String id) throws ProdutoInexistenteException {
		return this.buscarStreamProdutos().filter(p -> p.getProdutoId().equals(id)).findFirst()
				.orElseThrow(()-> new ProdutoInexistenteException(id));
	}

	public Stream<Produto> buscarProdutosPorId(List<String> itensIds) {
		return this.buscarStreamProdutos().filter(p -> itensIds.contains(p.getProdutoId()));
	}
}
