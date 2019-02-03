package com.devwarrios.mapfood.model;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;

@Document(collection = "produtos")
@Getter
@Setter
public class Produto {

    @Id
    private ObjectId id;

	private String descricao;

	@NotNull
    private Estabelecimento estabelecimento;

	private String restaurante;

	private String classificacao;

	private Double precoUnitario;

	private String cidade;

	public Produto() {}

	public Produto(String descricaoItem,
	               String restaurante,
	               String classificacao, Double precoUnitario, String cidade) {
		this.descricao = descricaoItem;
		this.restaurante = restaurante;
		this.classificacao = classificacao;
		this.precoUnitario = precoUnitario;
		this.cidade = cidade;
	}
}