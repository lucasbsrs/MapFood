package com.devwarrios.mapfood.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Entity
@Table(name = "produto")
@Getter
@Setter
public class Produto {

    @Id
    private Long id;

    @Column(name = "item")
	private String descricao;

    @Column(name = "item_id")
	private UUID itemId;

    @NotNull
    @OneToOne
    @JoinColumn(name = "restaurante_id")
    private Estabelecimento estabelecimento;

	private String restaurante;

	private String classificacao;

	@Column(name = "preco")
	private Double precoUnitario;

	private String cidade;

	public Produto() {}

	public Produto(String descricaoItem, UUID itemId,
                   String restaurante,
                   String classificacao, Double precoUnitario, String cidade) {
		this.descricao = descricaoItem;
		this.itemId = itemId;
        this.restaurante = restaurante;
		this.classificacao = classificacao;
		this.precoUnitario = precoUnitario;
		this.cidade = cidade;
	}
}