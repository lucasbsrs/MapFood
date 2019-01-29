package com.devwarrios.mapfood.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "cliente")
@Getter
@Setter
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "lon")
	private Double longitude;

	@Column(name = "lat")
	private Double latitude;

	public Cliente() {}

	public Cliente(Long id, Double longitude, Double latitude) {
		this.id = id;
		this.longitude = longitude;
		this.latitude = latitude;
	}
}