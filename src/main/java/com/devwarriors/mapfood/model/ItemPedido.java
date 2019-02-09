package com.devwarriors.mapfood.model;

import org.springframework.data.annotation.Id;

public class ItemPedido {

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	//@OneToOne
	//@JoinColumn(name = "produto_id")
	private Produto produto;

	private String observacao;

	//@ManyToOne
	private Pedido pedido;

	private int quantidade;

	public ItemPedido() {
	}

	public ItemPedido(Produto produto, int quantidade, String observacao) {
		this.produto = produto;
		this.quantidade = quantidade;
		this.observacao = observacao;
	}
}
