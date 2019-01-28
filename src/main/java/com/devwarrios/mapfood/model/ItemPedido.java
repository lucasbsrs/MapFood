package com.devwarrios.mapfood.model;

import javax.persistence.Entity;

@Entity
public class ItemPedido {

    private Produto produto;

    private String observacao;

    private int quantidade;
}
