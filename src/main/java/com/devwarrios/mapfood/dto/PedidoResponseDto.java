package com.devwarrios.mapfood.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class PedidoResponseDto {

	private String pedidoId;
	private String entregador;
	private double distancia;
	private double eta;
	private LocalDate timestamp;

	public PedidoResponseDto() {

	}

	public PedidoResponseDto(String pedidoId, String entregador, double distancia, double eta, LocalDate timestamp) {
		super();
		this.pedidoId = pedidoId;
		this.entregador = entregador;
		this.distancia = distancia;
		this.eta = eta;
		this.timestamp = timestamp;
	}

	public String getPedidoId() {
		return pedidoId;
	}

	public void setPedidoId(String pedidoId) {
		this.pedidoId = pedidoId;
	}

	public String getEntregador() {
		return entregador;
	}

	public void setEntregador(String entregador) {
		this.entregador = entregador;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	public double getEta() {
		return eta;
	}

	public void setEta(double eta) {
		this.eta = eta;
	}

	public LocalDate getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDate timestamp) {
		this.timestamp = timestamp;
	}

}
