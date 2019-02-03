package com.devwarrios.mapfood.model;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "motoboys")
@Getter
@Setter
public class Entregador {

	@Id
    private ObjectId id;

	@Field("ID Motoboy")
	private Long entregadorId;

	@Field("Longitude")
	private Double longitude;

	@Field("Latitude")
	private Double latitude;

	public Entregador() {}

	public Entregador(Long id, Double longitude, Double latitude) {
		this.entregadorId = id;
		this.longitude = longitude;
		this.latitude = latitude;
	}
}