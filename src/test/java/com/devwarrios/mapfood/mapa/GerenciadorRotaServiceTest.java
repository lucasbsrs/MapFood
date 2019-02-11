package com.devwarrios.mapfood.mapa;

import com.devwarriors.mapfood.model.*;
import com.devwarriors.mapfood.service.GerenciadorRotaService;
import org.junit.Test;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorRotaServiceTest {

	@Test
	public void testarGerenciadorRota() {

		Cliente cliente = new Cliente("", new GeoJsonPoint(12.00, 16.33));
		Estabelecimento estabelecimento = new Estabelecimento("", "Nono Ludovico", "Porto Alegre", new GeoJsonPoint(51.00, 55.00), "pizza");

		List<ItemPedido> itens = new ArrayList<>();

		Pedido pedido = new Pedido(cliente, estabelecimento, itens, LocalDate.now(), PedidoStatus.EM_PREPARO);

		Entregador entregador1 = new Entregador("", new GeoJsonPoint(11.0, 12.00));
		Entregador entregador2 = new Entregador("", new GeoJsonPoint(11.22, 4.0));
		Entregador entregador3 = new Entregador("", new GeoJsonPoint(11.22, 13.00));

		List<Entregador> entregadores = new ArrayList<>();
		entregadores.add(entregador1);
		entregadores.add(entregador2);
		entregadores.add(entregador3);

		GerenciadorRota gerenciadorRota = new GerenciadorRota(pedido, entregadores);

		GerenciadorRotaService gerenciadorRotaService = new GerenciadorRotaService(gerenciadorRota);
		gerenciadorRotaService.enviaProblemaRotaParaCalcular();
	}
}
