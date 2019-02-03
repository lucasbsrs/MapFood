package com.devwarrios.mapfood.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@Document(collection = "pedido")
public class Pedido {

	@Id
	private ObjectId id;

	@NotNull
	private Cliente cliente;

	@NotNull
	private Estabelecimento estabelecimento;

	private List<ItemPedido> itens;

	private LocalDate data;

	private PedidoStatus status;

	public Pedido() {}

	public Pedido(Cliente cliente, Estabelecimento estabelecimento, List<ItemPedido> itens, LocalDate data, PedidoStatus status) {
		this.cliente = cliente;
		this.estabelecimento = estabelecimento;
		this.itens = itens;
		this.data = data;
		this.status = status;
	}
}
