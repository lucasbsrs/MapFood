package com.devwarrios.mapfood.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "estabelecimento")
@Getter
@Setter
public class Estabelecimento {

	@Id
	private Long id;
	private String restaurante;
	private String cidade;

	@Column(name = "lon")
	private Double longitude;

	@Column(name = "lat")
	private Double latitude;

	@Transient
	private String descricaoPrato;

	//@OneToMany(mappedBy = "estabelecimento")
	//private List<Produto> produtos;

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