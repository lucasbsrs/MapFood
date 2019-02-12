package com.devwarriors.mapfood.utils;

import org.springframework.stereotype.Component;

import com.devwarriors.mapfood.model.PedidoStatus;

@Component
public class GerenciadorPedido {

	public PedidoStatus converteParaPedidoStatus(String novoStatus) {
		return PedidoStatus.valueOf(novoStatus);
	}

	public boolean transicaoValida(PedidoStatus status, PedidoStatus status2) {
		return true;
	}
}
