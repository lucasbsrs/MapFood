package com.devwarrios.mapfood.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.core.index.GeoSpatialIndexType;
import org.springframework.data.mongodb.core.index.GeoSpatialIndexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "clientes")
@Getter
@Setter
public class Cliente {

	@Id
	private String id;
	
	@Field("cliente_id")
	private Integer clienteId;

	@GeoSpatialIndexed(type = GeoSpatialIndexType.GEO_2DSPHERE)
	private GeoJsonPoint localizacao;

	public Cliente() {}

	public Cliente(String id, Integer clienteId, GeoJsonPoint localizacao) {
		this.id = id;
		this.clienteId = clienteId;
		this.localizacao = localizacao;
	}
}