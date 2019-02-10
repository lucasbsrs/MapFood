package com.devwarrios.mapfood.model.factory;

import java.time.LocalDateTime;

import com.devwarrios.mapfood.model.Entrega;

public class EntregaFactory {

	public static Entrega criaEntrega(String entregadorId, Double distancia_destino, Double eta) {
		LocalDateTime agora = LocalDateTime.now();

		return new Entrega(entregadorId, distancia_destino, 0.0, eta, agora, null, agora);
	}
}
