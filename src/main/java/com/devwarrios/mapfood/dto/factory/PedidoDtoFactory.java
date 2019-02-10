package com.devwarrios.mapfood.dto.factory;

import java.util.Optional;

import com.devwarrios.mapfood.dto.PedidoResponseDto;
import com.devwarrios.mapfood.dto.PedidoStatusResponseDto;
import com.devwarrios.mapfood.model.Entrega;
import com.devwarrios.mapfood.model.Pedido;
import com.devwarrios.mapfood.utils.GerenciadorTempo;

public class PedidoDtoFactory {

	public static PedidoResponseDto criaPedidoStatusResponseDto(Pedido pedido) {
		String pedidoId = pedido.getPedidoId();
		String pedidoStatus = pedido.getStatus().toString();
		Double valorTotal = pedido.getValorTotal();
		
		Optional<Entrega> entrega = pedido.getEntregaOptional();
		
		if (entrega.isPresent()) {
			String entregadorId = entrega.get().getEntregadorId();
			Double distancia = entrega.get().getDistancia_destino();
			Double eta = entrega.get().getEta();
			
			return new PedidoStatusResponseDto(pedidoId, pedidoStatus, valorTotal, GerenciadorTempo.agora(), entregadorId, distancia, eta);
		}
		else {
			return new PedidoResponseDto(pedidoId, pedidoStatus, valorTotal, GerenciadorTempo.agora());
		}
	}
}
