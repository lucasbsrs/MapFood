package com.devwarriors.mapfood.dto;

import com.devwarriors.mapfood.model.ProblemaRota;
import com.devwarriors.mapfood.model.enums.ModoCalculoRota;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

//@Setter
public class ProblemaRotaDto implements Serializable {

	private ModoCalculoRota modoCalculoRota;

	@JsonSetter("calculationMode")
	public void setModoCalculoRota(ModoCalculoRota modoCalculoRota) {
		this.modoCalculoRota = modoCalculoRota;
	}

	@JsonProperty("points")
	private List<Coordenada> coordenadas = new ArrayList<>();

	@JsonProperty("profileName")
	private String profileName = "BRAZIL";

	@JsonProperty("startDate")
	private LocalDateTime data;

	public void preencheRotas(ProblemaRota problemaRota) {


		coordenadas.add(new Coordenada(problemaRota.getLocalizacaoEntregador().getX(), problemaRota.getLocalizaoCliente().getY(), problemaRota.getEntregador().getId()));

		coordenadas.add(new Coordenada(problemaRota.getLocalizaoEstabelecimento().getX(), problemaRota.getLocalizaoEstabelecimento().getY(), problemaRota.getPedido().getEstabelecimento().getId()));

		coordenadas.add(new Coordenada(problemaRota.getLocalizaoCliente().getX(), problemaRota.getLocalizaoCliente().getY(), problemaRota.getPedido().getCliente().getId()));

	}

	@Getter
	@Setter
	@AllArgsConstructor
	@NoArgsConstructor
	private class Coordenada {
		private Double latitude;
		private Double longitude;
		private String siteId;
	}
}


