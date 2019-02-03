package com.devwarrios.mapfood.model;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Id;

@Document(collection = "motoboys")
@Getter
@Setter
public class Entregador {

	@Id
    private ObjectId id;

	@Field()
	private Long estabelecimentoId;

	@Field("Longitude")
	private Double longitude;

	@Field("Latitude")
	private Double latitude;

	public Entregador() {}

	public Entregador(Long id, Double longitude, Double latitude) {
		this.estabelecimentoId = id;
		this.longitude = longitude;
		this.latitude = latitude;
	}
}