package com.devwarriors.mapfood.mapa;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.devwarriors.mapfood.mapa.enums.ModoCalculoRota;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class RotaIndividualDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private ModoCalculoRota calculationMode;
	private List<Coordenada> points = new ArrayList<>();
	private String profileName = "BRAZIL";
	private int startDate = 0;

	public void preencheRotas(RotaIndividual problemaRota) {
		points.add(new Coordenada(problemaRota.getLocalizacaoEntregador().getX(),
				problemaRota.getLocalizacaoCliente().getY(), problemaRota.getEntregador().getEntregadorId()));
		points.add(new Coordenada(problemaRota.getLocalizacaoEstabelecimento().getX(),
				problemaRota.getLocalizacaoEstabelecimento().getY(),
				problemaRota.getEstabelecimento().getEstabelecimentoId()));
		points.add(new Coordenada(problemaRota.getLocalizacaoCliente().getX(), problemaRota.getLocalizacaoCliente().getY(),
				problemaRota.getCliente().getClienteId()));
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
