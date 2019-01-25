package com.devwarrios.mapfood.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
public class Produto {

    @Getter
    @Setter
	private String descricaoItem;

    @Getter
    @Setter
	private Long itemId;

    @Getter
    @Setter
	private Long restauranteId;

    @Getter
    @Setter
	private String restaurante;

    @Getter
    @Setter
	private String classificacao;

    @Getter
    @Setter
	private Double precoUnitario;

    @Getter
    @Setter
	private String cidade;

    public Produto () {}

	public Produto(String descricaoItem, Long itemId, Long restauranteId, String restaurante, String classificacao,
			Double precoUnitario, String cidade) {
		this.descricaoItem = descricaoItem;
		this.itemId = itemId;
		this.restauranteId = restauranteId;
		this.restaurante = restaurante;
		this.classificacao = classificacao;
		this.precoUnitario = precoUnitario;
		this.cidade = cidade;
	}

}