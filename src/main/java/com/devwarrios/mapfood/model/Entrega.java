package com.devwarrios.mapfood.model;

import java.time.Duration;
import java.time.LocalDateTime;

import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Entrega {

	@Field("entregador")
	private Entregador entregador;

	@Field("distancia_percorrida")
	private Double distancia_percorrida;

	@Field("hora_inicial")
	private LocalDateTime horaInicial;

	@Field("hora_final")
	private LocalDateTime horaFinal;

	@Field("atualizado_em")
	private LocalDateTime atualizadoEm;

	@Field("criado_em")
	private LocalDateTime criadoEm;

	public Double getDuracaoEmHoras() {
		if (horaInicial == null || horaFinal == null)
			return 0.0;

		return (double) (Duration.between(horaInicial, horaFinal).getSeconds() / 3600);
	}
}
