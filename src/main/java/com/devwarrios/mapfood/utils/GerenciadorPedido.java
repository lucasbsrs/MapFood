package com.devwarrios.mapfood.utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.stereotype.Component;

import com.devwarrios.mapfood.model.Pedido;
import com.devwarrios.mapfood.model.PedidoStatus;
import com.devwarrios.mapfood.model.Produto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Component
//@NoArgsConstructor
//@AllArgsConstructor
public class GerenciadorPedido {

	public boolean statusValido(String status) {
		return Arrays.asList(PedidoStatus.values()).contains(status);
	}

	public PedidoStatus converteParaPedidoStatus(String novoStatus) {
		return PedidoStatus.valueOf(novoStatus);
	}

	public boolean transicaoValida(PedidoStatus status, PedidoStatus status2) {
		return true;
	}
}
