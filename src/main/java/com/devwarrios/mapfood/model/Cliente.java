package com.devwarrios.mapfood.model;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;

//@Entity
//@Table(name = "cliente")
@Getter
@Setter
public class Cliente {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	
	private String clienteId;

	//@Column(name = "lon")
	private Double longitude;

	//@Column(name = "lat")
	private Double latitude;

	public Cliente() {
	}

	public Cliente(String clienteId, Double longitude, Double latitude) {
		this.clienteId = clienteId;
		this.longitude = longitude;
		this.latitude = latitude;
	}
}