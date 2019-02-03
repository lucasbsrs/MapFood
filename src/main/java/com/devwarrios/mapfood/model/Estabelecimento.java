package com.devwarrios.mapfood.model;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document(collection = "estabelecimentos")
@Getter
@Setter
public class Estabelecimento {

    @Id
    private ObjectId id;

    @Field("restaurant_id")
	private String estabelecimento_id;

	@Field("restaurant")
	private String restaurante;

	@Field("address_city")
	private String cidade;

	private Double longitude;

	private Double latitude;

	@Field("dish_description")
	private String descricaoPrato;

	private List<Produto> produtos;

	public Estabelecimento() {}

	public Estabelecimento(ObjectId id, String restaurante, String cidade,
                           Double longitude, Double latitude, String descricaoPrato) {
		this.id = id;
		this.restaurante = restaurante;
		this.cidade = cidade;
		this.longitude = longitude;
		this.latitude = latitude;
		this.descricaoPrato = descricaoPrato;
	}
}