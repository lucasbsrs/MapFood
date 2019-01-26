package com.devwarrios.mapfood.model;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Produto {

	private String descricaoItem;
	private Long itemId;
	private Long restauranteId;
	private String restaurante;
	private String classificacao;
	private Double precoUnitario;
	private String cidade;

    public Produto () {}

	public Produto(String descricaoItem, Long itemId,
			Long restauranteId, String restaurante,
			String classificacao, Double precoUnitario, String cidade) {
		this.descricaoItem = descricaoItem;
		this.itemId = itemId;
		this.restauranteId = restauranteId;
		this.restaurante = restaurante;
		this.classificacao = classificacao;
		this.precoUnitario = precoUnitario;
		this.cidade = cidade;
	}
}