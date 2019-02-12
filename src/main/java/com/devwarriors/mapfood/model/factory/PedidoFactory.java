package com.devwarriors.mapfood.model.factory;

import java.util.List;
import java.util.UUID;

import com.devwarriors.mapfood.model.ItemPedido;
import com.devwarriors.mapfood.model.Pedido;
import com.devwarriors.mapfood.model.PedidoStatus;
import com.devwarriors.mapfood.utils.GerenciadorTempo;

public class PedidoFactory {

	public static Pedido criaNovoPedido(String clienteId, String estabelecimentoId, List<ItemPedido> itens) {
		Pedido pedido = new Pedido(UUID.randomUUID().toString(), clienteId, estabelecimentoId, itens,
				GerenciadorTempo.agora(), GerenciadorTempo.agora(), PedidoStatus.EM_PREPARO);

		return pedido;
	}
}