package com.devwarriors.mapfood.model.factory;

import com.devwarriors.mapfood.model.Entrega;
import com.devwarriors.mapfood.utils.GerenciadorTempo;

public class EntregaFactory {

	public static Entrega criaEntrega(String entregadorId, Double distancia_destino, Double eta) {
		return new Entrega(entregadorId, distancia_destino, 0.0, eta, GerenciadorTempo.agora(), null,
				GerenciadorTempo.agora());
	}
}
