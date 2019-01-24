package com.devwarrios.mapfood.model;

import javax.persistence.Entity;

@Entity
public class Produto {
	
	private String descricaoItem;
	
	private Long itemId;
	
	private Long restauranteId;
	
	private String restaurante;
	
	private String classificacao;
	
	private Double precoUnitario;
	
	private String cidade;
	
	public Produto () {}

	public Produto(String itemDescription, Long itemId, Long restaurantId, String restaurant, String classification,
			Double unitPrice, String addressCity) {
		this.descricaoItem = itemDescription;
		this.itemId = itemId;
		this.restauranteId = restaurantId;
		this.restaurante = restaurant;
		this.classificacao = classification;
		this.precoUnitario = unitPrice;
		this.cidade = addressCity;
	}

	public String getItemDescription() {
		return descricaoItem;
	}

	public void setItemDescription(String itemDescription) {
		this.descricaoItem = itemDescription;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getRestaurantId() {
		return restauranteId;
	}

	public void setRestaurantId(Long restaurantId) {
		this.restauranteId = restaurantId;
	}

	public String getRestaurant() {
		return restaurante;
	}

	public void setRestaurant(String restaurant) {
		this.restaurante = restaurant;
	}

	public String getClassification() {
		return classificacao;
	}

	public void setClassification(String classification) {
		this.classificacao = classification;
	}

	public Double getUnitPrice() {
		return precoUnitario;
	}

	public void setUnitPrice(Double unitPrice) {
		this.precoUnitario = unitPrice;
	}

	public String getAddressCity() {
		return cidade;
	}

	public void setAddressCity(String addressCity) {
		this.cidade = addressCity;
	}
}