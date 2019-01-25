package com.devwarrios.mapfood.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Estabelecimento {

	@Id
	@Getter
	@Setter
	private Long id;

	@Getter
	@Setter
	private String restaurante;

	@Getter
	@Setter
	private String cidade;

	@Getter
	@Setter
	private Double longitude;

	@Getter
	@Setter
	private Double latitude;

	@Getter
	@Setter
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