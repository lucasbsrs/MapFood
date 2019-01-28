package com.devwarrios.mapfood.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "item_pedido")
public class ItemPedido {

    private Produto produto;

    private String observacao;

    private int quantidade;

    public ItemPedido() {}

    public ItemPedido(Produto produto, String observacao, int quantidade) {
        this.produto = produto;
        this.observacao = observacao;
        this.quantidade = quantidade;
    }
}
