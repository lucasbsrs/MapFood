package com.devwarriors.mapfood.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.core.index.GeoSpatialIndexType;
import org.springframework.data.mongodb.core.index.GeoSpatialIndexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document(collection = "estabelecimentos")
@Getter
@Setter
public class Estabelecimento {

	@Id
	private String id;

	@Field("estabelecimento_id")
	private String estabelecimentoId;

	@Field("estabelecimento")
	private String estabelecimento;

	@Field("cidade")
	private String cidade;

	@Field("culinaria")
	private String culinaria;

	@GeoSpatialIndexed(type = GeoSpatialIndexType.GEO_2DSPHERE)
	private GeoJsonPoint localizacao;

	@Field("produtos")
	private List<Produto> produtos;

	public Estabelecimento() {
	}

	public Estabelecimento(String estabelecimentoId, String estabelecimento, String cidade, GeoJsonPoint localizacao,
						   String culinaria) {
		this.estabelecimentoId = estabelecimentoId;
		this.estabelecimento = estabelecimento;
		this.cidade = cidade;
		this.localizacao = localizacao;
		this.culinaria = culinaria;
	}
}