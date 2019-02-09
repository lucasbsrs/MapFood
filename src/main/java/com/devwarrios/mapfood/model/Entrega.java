package com.devwarrios.mapfood.model;


import lombok.Getter;
import lombok.Setter;

import java.time.Duration;
import java.time.LocalDateTime;

@Setter
@Getter
public class Entrega {

	private Entregador entregador;
	private Double distanciaPercorrida;
	private LocalDateTime horaInicial;
	private LocalDateTime horaFinal;

	public Entrega() {
	}

    public Double getDuracaoEmHoras() {

	    if (horaInicial == null || horaFinal == null)
	        return new Double(0);

	    return new Double(Duration.between(horaInicial, horaFinal).getSeconds() / 3600);
    }
}
