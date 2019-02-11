package com.devwarriors.mapfood.mapa;

import com.devwarriors.mapfood.model.Entregador;
import com.devwarriors.mapfood.model.Pedido;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Document
public class ProcessamentoRota {

	@Id
	private String id;
	private Pedido pedido;
	private List<Entregador> entregadores;
    private List<String> problemas;
    private boolean solucionado;

	public ProcessamentoRota() {
	}

	public ProcessamentoRota(Pedido pedido, List<Entregador> entregadores) {
		this.pedido = pedido;
		this.entregadores = entregadores;
		this.solucionado = false;
		this.problemas = new ArrayList<>();
	}

    public void adicionaIdProblemaEmProcessamento(String problemaId) {
	    this.problemas.add(problemaId);
    }
}
