package com.devwarrios.mapfood.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "item_pedido")
public class ItemPedido {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@OneToOne
	@JoinColumn(name = "produto_id")
	private Produto produto;

	private String observacao;

	@ManyToOne
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
