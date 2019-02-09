package com.devwarrios.mapfood.model;

import java.time.LocalDateTime;
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
	
	@Field("entregadorId")
	private String entregadorId;

	@Field("itens")
	private List<ItemPedido> itens;

	@Field("status")
	private PedidoStatus status;

	@Field("entrega")
	private Entrega entrega;

	@Field("criado_em")
	private LocalDateTime criadoEm;

	@Field("atualizado_em")
	private LocalDateTime atualizadoEm;
	
	@Field("saiu_para_entrega_em")
	private LocalDateTime saiuParaEntregaEm;
	
	@Field("finalizado_em")
	private LocalDateTime finalizadoEm;

	public Pedido() {
	}

	public Pedido(String pedidoId, String clienteId, String estabelecimentoId, List<ItemPedido> itens,
			LocalDateTime criadoEm, LocalDateTime atualizadoEm, PedidoStatus status) {
		this.pedidoId = pedidoId;
		this.clienteId = clienteId;
		this.estabelecimentoId = estabelecimentoId;
		this.itens = itens;
		this.status = status;
		this.criadoEm = criadoEm;
		this.atualizadoEm = atualizadoEm;
		this.saiuParaEntregaEm = null;
		this.finalizadoEm = null;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", pedidoId=" + pedidoId + ", clienteId=" + clienteId + ", estabelecimentoId="
				+ estabelecimentoId + ", itens=" + itens + ", status=" + status + ", entrega=" + entrega + ", criadoEm="
				+ criadoEm + ", atualizadoEm=" + atualizadoEm + ", saiuParaEntregaEm=" + saiuParaEntregaEm
				+ ", finalizadoEm=" + finalizadoEm + "]";
	}

	public double getValorTotal() {
		return this.itens.stream()
				.map(item -> item.getQuantidade() * item.getProduto().getPrecoUnitario())
				.reduce(0.0, (acc, valores) -> acc + valores);
	}
}
