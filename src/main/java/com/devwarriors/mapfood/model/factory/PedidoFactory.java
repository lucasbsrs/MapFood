package com.devwarriors.mapfood.model.factory;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import com.devwarriors.mapfood.model.ItemPedido;
import com.devwarriors.mapfood.model.Pedido;
import com.devwarriors.mapfood.model.PedidoStatus;

public class PedidoFactory {

	private PedidoFactory() {
		
	}
	
	public static Pedido criaNovoPedido(String clienteId, String estabelecimentoId, List<ItemPedido> itens) {
		return new Pedido(UUID.randomUUID().toString(), clienteId, estabelecimentoId, itens,
				LocalDateTime.now(), LocalDateTime.now(), PedidoStatus.EM_PREPARO);

	}
}