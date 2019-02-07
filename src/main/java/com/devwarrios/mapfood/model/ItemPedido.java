package com.devwarrios.mapfood.model;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemPedido {

	@Id
	private String id;
	private Produto produto;
	private String observacao;
	private int quantidade;

	public ItemPedido() {
	}

	public ItemPedido(Produto produto, int quantidade, String observacao) {
		this.produto = produto;
		this.quantidade = quantidade;
		this.observacao = observacao;
	}
}
