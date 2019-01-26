package com.devwarrios.mapfood.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Cliente {
	
	@Id
	private Integer id;
	private Double longitude;
	private Double latitude;
	
	public Cliente() {}
	
	public Cliente(Integer id, Double longitude, Double latitude) {
		this.id = id;
		this.longitude = longitude;
		this.latitude = latitude;
	}
}