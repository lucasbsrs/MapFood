package com.devwarriors.mapfood.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDate;
import java.util.List;

@Document(collection = "pedidos")
@Getter
@Setter
public class Pedido {

	@Id
	private String id;
	
	@Field("pedido_id")
	private String pedidoId;
	
	@Field("cliente")
	private Cliente cliente;
	
	@Field("estabelecimento")
	private Estabelecimento estabelecimento;
	
	@Field("itens")
	private List<ItemPedido> itens;
	
	@Field("data")
	private LocalDate data;
	
	@Field("status")
	private PedidoStatus status;

	@Field("entrega")
	private Entrega entrega;

	public Pedido() {
	}

	public Pedido(Cliente cliente, Estabelecimento estabelecimento, List<ItemPedido> itens, LocalDate data,
			PedidoStatus status) {
		this.cliente = cliente;
		this.estabelecimento = estabelecimento;
		this.itens = itens;
		this.data = data;
		this.status = status;
	}

	public String getId() {
		return id;
	}

	public String getPedidoId() {
		return pedidoId;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Estabelecimento getEstabelecimento() {
		return estabelecimento;
	}

	public List<ItemPedido> getItens() {
		return itens;
	}

	public LocalDate getData() {
		return data;
	}

	public PedidoStatus getStatus() {
		return status;
	}

	public Entrega getEntrega() {
		return entrega;
	}
}
