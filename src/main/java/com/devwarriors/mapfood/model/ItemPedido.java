package com.devwarriors.mapfood.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemPedido {

	@Id
	private String id;

	@Field("produto")
	private Produto produto;

	@Field("observacao")
	private String observacao;

	@Field("quantidade")
	private int quantidade;

	public ItemPedido() {
	}

	public ItemPedido(Produto produto, int quantidade, String observacao) {
		this.produto = produto;
		this.quantidade = quantidade;
		this.observacao = observacao;
	}
}
