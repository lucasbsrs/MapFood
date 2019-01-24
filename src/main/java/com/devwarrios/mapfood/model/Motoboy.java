package com.devwarrios.mapfood.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Motoboy {
	
	@Id
	private Integer id;
	
	private Double longitude;
	
	private Double latitude;
	
	public Motoboy() {}
	
	public Motoboy (Integer id, Double longitude, Double latitude) {
		this.id = id;
		this.longitude = longitude;
		this.latitude = latitude;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
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
}