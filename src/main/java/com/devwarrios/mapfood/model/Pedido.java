package com.devwarrios.mapfood.model;

import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;

//@Entity
//@Table(name = "pedido")
public class Pedido {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	
	//private String pedidoId;

	@NotNull
	//@OneToOne
	//@JoinColumn(name = "cliente_id")
	private Cliente cliente;

	@NotNull
	//@OneToOne
	//@JoinColumn(name = "estabelecimento_id")
	private Estabelecimento estabelecimento;

	//@OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<ItemPedido> itens;

	private LocalDate data;

	//@Enumerated(EnumType.STRING)
	private PedidoStatus status;

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

	public void setId(String id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Estabelecimento getEstabelecimento() {
		return estabelecimento;
	}

	public void setEstabelecimento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

	public List<ItemPedido> getItens() {
		return itens;
	}

	public void setItens(List<ItemPedido> itens) {
		this.itens = itens;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public PedidoStatus getStatus() {
		return status;
	}

	public void setStatus(PedidoStatus status) {
		this.status = status;
	}
}
