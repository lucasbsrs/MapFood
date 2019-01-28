package com.devwarrios.mapfood.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "estabelecimento")
@Getter
@Setter
public class Estabelecimento {

	@Id
	private Long id;
	private String restaurante;
	private String cidade;
	private Double longitude;
	private Double latitude;
	private String descricaoPrato;

	// Verificar se está correta essa anotação - @OneToMany(mappedBy = "id.estabelecimento")
	private List<Produto> produtos;

	public Estabelecimento() {}

	public Estabelecimento(Long id, String restaurante, String cidade,
	                       Double longitude, Double latitude, String descricaoPrato) {
		this.id = id;
		this.restaurante = restaurante;
		this.cidade = cidade;
		this.longitude = longitude;
		this.latitude = latitude;
		this.descricaoPrato = descricaoPrato;
	}
}