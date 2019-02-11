package com.devwarriors.mapfood.dto.factory;

import java.util.Optional;

import com.devwarriors.mapfood.dto.response.PedidoResponseDto;
import com.devwarriors.mapfood.dto.response.PedidoStatusResponseDto;
import com.devwarriors.mapfood.model.Entrega;
import com.devwarriors.mapfood.model.Pedido;
import com.devwarriors.mapfood.utils.GerenciadorTempo;

public class PedidoDtoFactory {

	public static PedidoResponseDto criaPedidoStatusResponseDto(Pedido pedido) {
		String pedidoId = pedido.getPedidoId();
		String pedidoStatus = pedido.getStatus().toString();
		Double valorTotal = pedido.getValorTotal();

		Optional<Entrega> entrega = pedido.getEntregaOptional();

		if (entrega.isPresent()) {
			String entregadorId = entrega.get().getEntregadorId();
			Double distancia = entrega.get().getDistanciaDestino();
			Double eta = entrega.get().getEta();

			return new PedidoStatusResponseDto(pedidoId, pedidoStatus, valorTotal, GerenciadorTempo.agora(),
					entregadorId, distancia, eta);
		} else {
			return new PedidoResponseDto(pedidoId, pedidoStatus, valorTotal, GerenciadorTempo.agora());
		}
	}

	public static PedidoResponseDto criaPedidoCanceladoResponseDto(Pedido pedido) {
		String pedidoId = pedido.getPedidoId();
		String pedidoStatus = pedido.getStatus().toString();
		Double valorTotal = pedido.getValorTotal();

		return new PedidoResponseDto(pedidoId, pedidoStatus, valorTotal, GerenciadorTempo.agora());
	}
}
