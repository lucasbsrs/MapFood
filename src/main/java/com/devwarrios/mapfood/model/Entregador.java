package com.devwarrios.mapfood.model;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;

//@Entity
//@Table(name = "entregador")
@Getter
@Setter
public class Entregador {

	@Id
	private String id;
	
	private String entregadorId;

	//@Column(name = "lon")
	private Double longitude;

	//@Column(name = "lat")
	private Double latitude;

	public Entregador() {
	}

	public Entregador(String entregadorId, Double longitude, Double latitude) {
		this.entregadorId = entregadorId;
		this.longitude = longitude;
		this.latitude = latitude;
	}
}