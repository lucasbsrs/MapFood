package com.devwarriors.mapfood.dto.factory;

import java.time.LocalDate;
import java.util.List;

import com.devwarriors.mapfood.model.Cliente;
import com.devwarriors.mapfood.model.Estabelecimento;
import com.devwarriors.mapfood.model.ItemPedido;
import com.devwarriors.mapfood.model.Pedido;
import com.devwarriors.mapfood.model.PedidoStatus;

public class PedidoFactory {

	public static Pedido criaNovoPedido(Cliente cliente, Estabelecimento estabelecimento, List<ItemPedido> itens) {
		Pedido pedido = new Pedido(cliente, estabelecimento, itens, LocalDate.now(), PedidoStatus.EM_PREPARO);

		return pedido;
	}
}
