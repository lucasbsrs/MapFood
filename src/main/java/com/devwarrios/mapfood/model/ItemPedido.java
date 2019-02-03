package com.devwarrios.mapfood.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "item_pedido")
public class ItemPedido {

    @Id
    private ObjectId id;

	private Produto produto;

	private String observacao;

	private Pedido pedido;

	private int quantidade;

	public ItemPedido() {}

	public ItemPedido(Produto produto, String observacao, int quantidade) {
		this.produto = produto;
		this.observacao = observacao;
		this.quantidade = quantidade;
	}
}
