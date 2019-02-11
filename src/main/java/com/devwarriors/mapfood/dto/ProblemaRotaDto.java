package com.devwarriors.mapfood.dto;

import com.devwarriors.mapfood.model.ProblemaRota;
import com.devwarriors.mapfood.model.enums.ModoCalculoRota;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ProblemaRotaDto implements Serializable {

	private ModoCalculoRota modoCalculoRota;
	private List<Coordenada> coordenadas = new ArrayList<>();
	private String profileName = "BRAZIL";

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


