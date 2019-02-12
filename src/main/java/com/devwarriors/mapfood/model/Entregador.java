package com.devwarriors.mapfood.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.core.index.GeoSpatialIndexType;
import org.springframework.data.mongodb.core.index.GeoSpatialIndexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

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

	@Field("localizacao")
	@GeoSpatialIndexed(type = GeoSpatialIndexType.GEO_2DSPHERE)
	private GeoJsonPoint localizacao;

	@Field("capacidade_disponivel")
	private Integer capacidadeDisponivel;

	public Entregador() {
	}

	public Entregador(String entregadorId, GeoJsonPoint localizacao, int capacidadeDisponivel) {
		this.entregadorId = entregadorId;
		this.localizacao = localizacao;
		this.capacidadeDisponivel = capacidadeDisponivel;
	}
}