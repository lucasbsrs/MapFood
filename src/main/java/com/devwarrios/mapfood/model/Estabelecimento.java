package com.devwarrios.mapfood.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Estabelecimento {

	@Id
	private Long id;
	
	private String restaurant;
	
	private String addressCity;
	
	private Double longitude;
	
	private Double latitude;
	
	private String dishDescription;
	
	// Verificar se está correta essa anotação - @OneToMany(mappedBy = "id.estabelecimento")
	private List<Produto> produtos;
	
	public Estabelecimento() {}
	
	public Estabelecimento(Long id, String restaurant, String addressCity, 
			Double longitude, Double latitude, String dishDescription) {
		this.id = id;
		this.restaurant = restaurant;
		this.addressCity = addressCity;
		this.longitude = longitude;
		this.latitude = latitude;
		this.dishDescription = dishDescription;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(String restaurant) {
		this.restaurant = restaurant;
	}

	public String getAddressCity() {
		return addressCity;
	}

	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public String getDishDescription() {
		return dishDescription;
	}

	public void setDishDescription(String dishDescription) {
		this.dishDescription = dishDescription;
	}
	
	public List<Produto> getProdutos() {
		return produtos;
	}
	
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
}