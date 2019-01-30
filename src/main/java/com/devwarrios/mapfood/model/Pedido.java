package com.devwarrios.mapfood.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "pedido")
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
    @OneToOne
    @JoinColumn(name = "cliente_id")
	private Cliente cliente;

	@NotNull
    @OneToOne
    @JoinColumn(name = "estabelecimento_id")
	private Estabelecimento estabelecimento;

	@OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<ItemPedido> itens;

	private LocalDate data;

	@Enumerated(EnumType.STRING)
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
