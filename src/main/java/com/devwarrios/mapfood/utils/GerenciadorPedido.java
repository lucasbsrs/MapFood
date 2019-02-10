package com.devwarrios.mapfood.utils;

import java.util.Arrays;

import org.springframework.stereotype.Component;

import com.devwarrios.mapfood.model.PedidoStatus;

@Component
public class GerenciadorPedido {

	public PedidoStatus converteParaPedidoStatus(String novoStatus) {
		return PedidoStatus.valueOf(novoStatus);
	}

	public boolean transicaoValida(PedidoStatus status, PedidoStatus status2) {
		return true;
	}
}
