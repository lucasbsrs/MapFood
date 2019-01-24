package com.devwarrios.mapfood.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Estabelecimento {

	@Id
	private Long id;
	
	private String restaurante;
	
	private String cidade;
	
	private Double longitude;
	
	private Double latitude;
	
	private String descricaoPrato;
	
	// Verificar se está correta essa anotação - @OneToMany(mappedBy = "id.estabelecimento")
	private List<Produto> produtos;
	
	public Estabelecimento() {}
	
	public Estabelecimento(Long id, String restaurant, String addressCity, 
			Double longitude, Double latitude, String dishDescription) {
		this.id = id;
		this.restaurante = restaurant;
		this.cidade = addressCity;
		this.longitude = longitude;
		this.latitude = latitude;
		this.descricaoPrato = dishDescription;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getRestaurant() {
		return restaurante;
	}

	public void setRestaurant(String restaurant) {
		this.restaurante = restaurant;
	}

	public String getAddressCity() {
		return cidade;
	}

	public void setAddressCity(String addressCity) {
		this.cidade = addressCity;
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
		return descricaoPrato;
	}

	public void setDishDescription(String dishDescription) {
		this.descricaoPrato = dishDescription;
	}
	
	public List<Produto> getProdutos() {
		return produtos;
	}
	
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
}