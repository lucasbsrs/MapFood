package com.devwarriors.mapfood.model;

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
    	double duracaoEmHoras = 0.0;
    	
	    if (horaInicial == null || horaFinal == null)
	        return duracaoEmHoras;

	    duracaoEmHoras = (Duration.between(horaInicial, horaFinal).getSeconds()) / 3600.0;
	    
	    return duracaoEmHoras;
    }

	public Entregador getEntregador() {
		return entregador;
	}

	public Double getDistanciaPercorrida() {
		return distanciaPercorrida;
	}

	public LocalDateTime getHoraInicial() {
		return horaInicial;
	}

	public LocalDateTime getHoraFinal() {
		return horaFinal;
	}
}
