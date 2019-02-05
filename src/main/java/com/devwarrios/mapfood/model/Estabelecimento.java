package com.devwarrios.mapfood.model;

import java.util.List;
import java.util.UUID;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;

//@Entity
//@Table(name = "estabelecimento")
@Getter
@Setter
public class Estabelecimento {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;

	//@Column(unique = true)
	//@Type(type = "uuid-char")
	private String estabelecimentoId;

	private String estabelecimento;

	private String cidade;

	//@Column(name = "lon")
	private Double longitude;

	//@Column(name = "lat")
	private Double latitude;

	//@Transient
	private String descricaoPrato;

	//@OneToMany(mappedBy = "estabelecimento")
	private List<Produto> produtos;

	public Estabelecimento() {
	}

	public Estabelecimento(String estabelecimentoId, String estabelecimento, String cidade, Double longitude, Double latitude,
			String descricaoPrato) {
		this.estabelecimentoId = estabelecimentoId;
		this.estabelecimento = estabelecimento;
		this.cidade = cidade;
		this.longitude = longitude;
		this.latitude = latitude;
		this.descricaoPrato = descricaoPrato;
	}
}