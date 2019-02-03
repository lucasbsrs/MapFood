package com.devwarrios.mapfood.model;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "clientes")
@Getter
@Setter
public class Cliente {

	@Id
	private ObjectId id;

	//@Field("ID Cliente")
	//private Long clienteId;

	@Field("Longitude")
	private Double longitude;

	@Field("Latitude")
	private Double latitude;

	public Cliente() {}

	public Cliente(ObjectId id, Double longitude, Double latitude) {
		this.id = id;
		this.longitude = longitude;
		this.latitude = latitude;
	}
}