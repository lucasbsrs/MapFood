package com.devwarrios.mapfood.model;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;

//@Entity
//@Table(name = "produto")
@Getter
@Setter
public class Produto {

	@Id
	private String id;
	
	private String produtoId;

	//@Column(name = "item")
	private String descricao;

	@NotNull
	//@ManyToOne
	//@JoinColumn(name = "estabelecimento_id", referencedColumnName = "estabelecimento_id")
	private Estabelecimento estabelecimento;

	private String restaurante;

	private String classificacao;

	//@Column(name = "preco")
	private Double precoUnitario;

	private String cidade;

	public Produto() {
	}

	public Produto(String descricaoItem, Estabelecimento estabelecimento, String classificacao, Double precoUnitario,
			String cidade) {
		this.descricao = descricaoItem;
		this.estabelecimento = estabelecimento;
		this.classificacao = classificacao;
		this.precoUnitario = precoUnitario;
		this.cidade = cidade;
	}
}