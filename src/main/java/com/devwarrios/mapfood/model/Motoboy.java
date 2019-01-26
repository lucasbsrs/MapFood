package com.devwarrios.mapfood.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Motoboy {
	
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
	
	public Motoboy() {}
	
	public Motoboy (Integer id, Double longitude, Double latitude) {
		this.id = id;
		this.longitude = longitude;
		this.latitude = latitude;
	}
}