package com.devwarrios.mapfood.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Document(collection = "produtos")
@Getter
@Setter
public class Produto {

    @Id
    private Long id;

    @Column(name = "item")
	private String descricao;

	@NotNull
    @ManyToOne
    @JoinColumn(name = "estabelecimento_id", referencedColumnName = "estabelecimento_id")
    private Estabelecimento estabelecimento;

	private String restaurante;

	private String classificacao;

	@Column(name = "preco")
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