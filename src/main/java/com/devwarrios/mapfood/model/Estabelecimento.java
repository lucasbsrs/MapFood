package com.devwarrios.mapfood.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Document(collection = "estabelecimentos")
@Getter
@Setter
public class Estabelecimento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(unique = true)
	@Type(type = "uuid-char")
	private UUID estabelecimento_id;

	private String restaurante;

	private String cidade;

	@Column(name = "lon")
	private Double longitude;

	@Column(name = "lat")
	private Double latitude;

	@Transient
	private String descricaoPrato;

	@OneToMany(mappedBy = "estabelecimento")
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