package com.devwarrios.mapfood.model;

import javax.persistence.*;

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

	public ItemPedido() {}

	public ItemPedido(Produto produto, String observacao, int quantidade) {
		this.produto = produto;
		this.observacao = observacao;
		this.quantidade = quantidade;
	}
}
