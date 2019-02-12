package com.devwarriors.mapfood.mapa;

/*
import com.devwarriors.mapfood.mapa.GerenciadorRota;
import com.devwarriors.mapfood.model.*;
import org.junit.Test;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProcessamentoRotaServiceTest {

	@Test
	public void ennviarDeProblemaDeRotaProMapLink() {

		Cliente cliente = new Cliente("999", new GeoJsonPoint(-30.0376115, -51.1941124));
		Estabelecimento estabelecimento = new Estabelecimento("777", "Nono Ludovico", "Porto Alegre",
				new GeoJsonPoint(-30.0375048, -51.1896524), "pizza");

		List<ItemPedido> itens = new ArrayList<>();

		Pedido pedido = new Pedido(cliente, estabelecimento, itens, LocalDate.now(), PedidoStatus.EM_PREPARO);
		pedido.setPedidoId("12345");

		Entregador entregador1 = new Entregador("111perto", new GeoJsonPoint(-30.0379782, -51.1978455));
		Entregador entregador2 = new Entregador("222muito longe", new GeoJsonPoint(-30.0458515, -51.1089538));
		Entregador entregador3 = new Entregador("333perto", new GeoJsonPoint(-30.0432194, -51.2018124));

		List<Entregador> entregadores = new ArrayList<>();
		entregadores.add(entregador1);
		entregadores.add(entregador2);
		entregadores.add(entregador3);

		GerenciadorRota gerenciadorRota = new GerenciadorRota();
		gerenciadorRota.enviaProblemaDeRotaParaCalcular(pedido, entregadores);
	}

	@Test
	public void enviarDeProblemaDeRotaProMapLink() {

		Pedido pedido = new Pedido();
		pedido.setPedidoId("12345");

		GerenciadorRota gerenciadorRota = new GerenciadorRota();
		gerenciadorRota.retornaSolucaoDeRota(pedido);

	}
}
*/