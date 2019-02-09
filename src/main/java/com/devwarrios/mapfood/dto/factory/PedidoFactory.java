package com.devwarrios.mapfood.dto.factory;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import com.devwarrios.mapfood.model.ItemPedido;
import com.devwarrios.mapfood.model.Pedido;
import com.devwarrios.mapfood.model.PedidoStatus;

public class PedidoFactory {

	public static Pedido criaNovoPedido(String clienteId, String estabelecimentoId, List<ItemPedido> itens) {
		Pedido pedido = new Pedido(UUID.randomUUID().toString(), clienteId, estabelecimentoId, itens,
				LocalDateTime.now(), LocalDateTime.now(), PedidoStatus.EM_PREPARO);

		return pedido;
	}
}