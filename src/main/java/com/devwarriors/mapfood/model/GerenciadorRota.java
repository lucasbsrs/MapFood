package com.devwarriors.mapfood.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Document
public class GerenciadorRota {

	@Id
	private String id;
	private Pedido pedido;
	private List<String> problemas;

	@Transient
	private List<Entregador> entregadores;

	public GerenciadorRota() {
	}

	public GerenciadorRota(Pedido pedido, List<Entregador> entregadores) {
		this.pedido = pedido;
		this.entregadores = entregadores;
		this.problemas = new ArrayList<>();
	}
}
