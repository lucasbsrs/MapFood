package com.devwarrios.mapfood.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Cliente cliente;

    private Estabelecimento estabelecimento;

    private List<ItemPedido> itens;

    @Temporal(TemporalType.DATE)
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
