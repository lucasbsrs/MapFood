package com.devwarriors.mapfood.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.Setter;

@Document(collection = "produtos")
@Getter
@Setter
public class Produto {

	@Id
	private String id;

	@Field("produto_id")
	private String produtoId;

	@Field("descricao")
	private String descricao;

	@Field("classificao")
	private String classificacao;

	@Field("preco_unitario")
	private Double precoUnitario;

	@Field("cidade")
	private String cidade;

	public Produto() {
	}

	public Produto(String descricaoItem, String classificacao, Double precoUnitario, String cidade) {
		this.descricao = descricaoItem;
		this.classificacao = classificacao;
		this.precoUnitario = precoUnitario;
		this.cidade = cidade;
	}
}