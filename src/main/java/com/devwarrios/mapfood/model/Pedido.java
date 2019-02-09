package com.devwarrios.mapfood.model;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.Setter;

@Document(collection = "pedidos")
@Getter
@Setter
public class Pedido {

	@Id
	private String id;

	@Field("pedido_id")
	private String pedidoId;

	@Field("clienteId")
	private String clienteId;

	@Field("estabelecimentoId")
	private String estabelecimentoId;

	@Field("itens")
	private List<ItemPedido> itens;

	@Field("data")
	private LocalDate data;

	@Field("status")
	private PedidoStatus status;

	public Pedido() {
	}

	public Pedido(String pedidoId, String clienteId, String estabelecimentoId, List<ItemPedido> itens, LocalDate data,
			PedidoStatus status) {
		this.pedidoId = pedidoId;
		this.clienteId = clienteId;
		this.estabelecimentoId = estabelecimentoId;
		this.itens = itens;
		this.data = data;
		this.status = status;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", pedidoId=" + pedidoId + ", clienteId=" + clienteId + ", estabelecimentoId="
				+ estabelecimentoId + ", itens=" + itens + ", data=" + data + ", status=" + status + "]";
	}
}
