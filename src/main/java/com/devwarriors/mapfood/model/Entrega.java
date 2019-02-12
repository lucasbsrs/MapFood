package com.devwarriors.mapfood.model;

import java.time.Duration;
import java.time.LocalDateTime;

import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Entrega {

	@Field("entregador_id")
	private String entregadorId;

	@Field("distancia_destino")
	private Double distanciaDestino;

	@Field("distancia_percorrida")
	private Double distanciaPercorrida;

	@Field("eta")
	private Double eta;

	@Field("criado_em")
	private LocalDateTime criadoEm;

	@Field("finalizado_em")
	private LocalDateTime finalizadoEm;

	@Field("atualizado_em")
	private LocalDateTime atualizadoEm;

	public Double getDuracaoEmHoras() {
		if (criadoEm == null || finalizadoEm == null)
			return 0.0;

		return new Double((Duration.between(criadoEm, finalizadoEm).getSeconds() / 3600));
	}
}
