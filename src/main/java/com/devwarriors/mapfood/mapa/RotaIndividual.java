package com.devwarriors.mapfood.mapa;

import com.devwarriors.mapfood.mapa.enums.ModoCalculoRota;
import com.devwarriors.mapfood.model.Cliente;
import com.devwarriors.mapfood.model.Entregador;
import com.devwarriors.mapfood.model.Estabelecimento;
import com.devwarriors.mapfood.model.Pedido;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "rota_individual")
public class RotaIndividual {

	@Id
	private String id;
	private Pedido pedido;
	private Estabelecimento estabelecimento;
	private Entregador entregador;
	private Cliente cliente;
	private ModoCalculoRota modoCalculoRota;
	private String problemaId;

	public RotaIndividual() {
	}

	public RotaIndividual(Pedido pedido, Estabelecimento estabelecimento, Entregador entregador, Cliente cliente) {
		this.pedido = pedido;
		this.estabelecimento = estabelecimento;
		this.entregador = entregador;
		this.cliente = cliente;
	}

	public GeoJsonPoint getLocalizacaoEntregador() {
		if (entregador == null) {
			return null;
		}

		return entregador.getLocalizacao();
	}

	public GeoJsonPoint getLocalizacaoCliente() {
		if (this.cliente == null) {
			return null;
		}

		return cliente.getLocalizacao();
	}

	public GeoJsonPoint getLocalizacaoEstabelecimento() {
		if (this.estabelecimento == null)
		{
			return null;
		}

		return estabelecimento.getLocalizacao();
	}

}
