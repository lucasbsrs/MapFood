package com.devwarrios.mapfood.model;

import javax.persistence.Entity;

@Entity
public class Produto {
	
	private String itemDescription;
	
	private Long itemId;
	
	private Long restaurantId;
	
	private String restaurant;
	
	private String classification;
	
	private Double unitPrice;
	
	private String addressCity;
	
	public Produto () {}

	public Produto(String itemDescription, Long itemId, Long restaurantId, String restaurant, String classification,
			Double unitPrice, String addressCity) {
		this.itemDescription = itemDescription;
		this.itemId = itemId;
		this.restaurantId = restaurantId;
		this.restaurant = restaurant;
		this.classification = classification;
		this.unitPrice = unitPrice;
		this.addressCity = addressCity;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(Long restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(String restaurant) {
		this.restaurant = restaurant;
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getAddressCity() {
		return addressCity;
	}

	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}
}