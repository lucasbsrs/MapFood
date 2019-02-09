package com.devwarriors.mapfood.model;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

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

	public Pedido(Optional<Cliente> cliente, Estabelecimento estabelecimento, List<ItemPedido> itens, LocalDate now, PedidoStatus emPreparo) {
	}

	public Pedido(Cliente cliente, Estabelecimento estabelecimento, List<ItemPedido> itens, LocalDate data,
			PedidoStatus status) {
		this.cliente = cliente;
		this.estabelecimento = estabelecimento;
		this.itens = itens;
		this.data = data;
		this.status = status;
	}
}
