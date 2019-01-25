package com.devwarrios.mapfood.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cliente {
	
	@Id
	@Getter
	@Setter
	private Integer id;

	@Getter
	@Setter
	private Double longitude;

	@Getter
	@Setter
	private Double latitude;
	
	public Cliente() {}
	
	public Cliente(Integer id, Double longitude, Double latitude) {
		this.id = id;
		this.longitude = longitude;
		this.latitude = latitude;
	}
}