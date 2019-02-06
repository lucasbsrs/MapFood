package com.devwarrios.mapfood.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.GeoSpatialIndexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.mongodb.client.model.geojson.Point;

import lombok.Getter;
import lombok.Setter;

@Document(collection = "clientes")
@Getter
@Setter
public class Cliente {

	@Id
	private String id;
	
	@Field("cliente_id")
	private String clienteId;

	@GeoSpatialIndexed(name = "2dsphere")
	private Point localizacao;

	public Cliente() {
	}

	public Cliente(String clienteId, Point localizacao) {
		this.clienteId = clienteId;
		this.localizacao = localizacao;
	}
}