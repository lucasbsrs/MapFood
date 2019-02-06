package com.devwarrios.mapfood.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.GeoSpatialIndexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.mongodb.client.model.geojson.Point;

import lombok.Getter;
import lombok.Setter;

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

	@Field("descricacao")
	private String descricaoPrato;
	
	@GeoSpatialIndexed(name = "2dsphere")
	private Point localizacao;

	@Field("produtos")
	private List<Produto> produtos;

	public Estabelecimento() {
	}

	public Estabelecimento(String estabelecimentoId, String estabelecimento, String cidade, Point localizacao,
			String descricaoPrato) {
		this.estabelecimentoId = estabelecimentoId;
		this.estabelecimento = estabelecimento;
		this.cidade = cidade;
		this.localizacao = localizacao;
		this.descricaoPrato = descricaoPrato;
	}
}