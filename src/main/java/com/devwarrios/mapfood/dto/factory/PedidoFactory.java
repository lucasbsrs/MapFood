package com.devwarrios.mapfood.dto.factory;

import java.time.LocalDate;
import java.util.List;

import com.devwarrios.mapfood.model.Cliente;
import com.devwarrios.mapfood.model.Estabelecimento;
import com.devwarrios.mapfood.model.ItemPedido;
import com.devwarrios.mapfood.model.Pedido;
import com.devwarrios.mapfood.model.PedidoStatus;

public class PedidoFactory {

	public static Pedido criaNovoPedido(Cliente cliente, Estabelecimento estabelecimento, List<ItemPedido> itens) {
		Pedido pedido = new Pedido(cliente, estabelecimento, itens, LocalDate.now(), PedidoStatus.EM_PREPARO);

		return pedido;
	}
}
