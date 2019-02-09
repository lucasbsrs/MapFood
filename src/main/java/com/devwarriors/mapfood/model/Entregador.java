package com.devwarriors.mapfood.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.GeoSpatialIndexType;
import org.springframework.data.mongodb.core.index.GeoSpatialIndexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.mongodb.client.model.geojson.Point;

import lombok.Getter;
import lombok.Setter;

@Document(collection = "entregadores")
@Getter
@Setter
public class Entregador {

	@Id
	private String id;

	@Field("entregador_id")
	private String entregadorId;

	@GeoSpatialIndexed(type = GeoSpatialIndexType.GEO_2DSPHERE)
	private Point localizacao;

	public Entregador() {}

	public Entregador(String entregadorId, Point localizacao) {
		this.entregadorId = entregadorId;
		this.localizacao = localizacao;
	}
}