package com.devwarrios.mapfood.model;


import lombok.Getter;
import lombok.Setter;

import java.time.Duration;

@Setter
@Getter
public class Entrega {

	private Entregador entregador;
	private Double distanciaPercorrida;
	private Duration tempoDecorrido;

	public Entrega() {
	}

	public Entrega(Entregador entregador, Double distanciaPercorrida, Duration tempoDecorrido) {
		this.entregador = entregador;
		this.distanciaPercorrida = distanciaPercorrida;
		this.tempoDecorrido = tempoDecorrido;
	}
}
