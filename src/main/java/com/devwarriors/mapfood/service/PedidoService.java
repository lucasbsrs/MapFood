package com.devwarriors.mapfood.service;

import com.devwarriors.mapfood.dto.ItemPedidoDto;
import com.devwarriors.mapfood.dto.PedidoRequestDto;
import com.devwarriors.mapfood.dto.PedidoResponseDto;
import com.devwarriors.mapfood.dto.factory.PedidoFactory;
import com.devwarriors.mapfood.mapa.GerenciadorRota;
import com.devwarriors.mapfood.model.*;
import com.devwarriors.mapfood.repository.ClienteRepository;
import com.devwarriors.mapfood.repository.EstabelecimentoRepository;
import com.devwarriors.mapfood.repository.PedidoRepository;
import com.devwarriors.mapfood.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private EstabelecimentoRepository estabelecimentoRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;

	@Autowired
    private PedidoRepository pedidoRepository;

	@Autowired
    private GerenciadorRota gerenciadorRota;

	public PedidoResponseDto criaPedido(PedidoRequestDto pedidoRequestDto) {
		String clienteId = pedidoRequestDto.getClienteId();
		String estabelecimentoId = pedidoRequestDto.getEstabelecimentoId();

		Cliente cliente = null;
		Estabelecimento estabelecimento = null;
		List<ItemPedido> itens = null;

		try {
			System.out.println(clienteId);
			cliente = clienteRepository.findByClienteId(clienteId).get(0);
		}
		catch (Exception e) {
			System.out.println("Cliente");
			e.printStackTrace();
		}
		
		try {
			estabelecimento = estabelecimentoRepository.findByEstabelecimentoId(estabelecimentoId)
					.get(0);
	
			List<ItemPedidoDto> itensDto = pedidoRequestDto.getItens();
			itens = new ArrayList<>();
			for (ItemPedidoDto ipd : itensDto) {
				Produto produto = produtoRepository.findByProdutoId(ipd.getProdutoId()).get(0);
	
				itens.add(new ItemPedido(produto, ipd.getQuantidade(), ipd.getObservacao()));
			}
			
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		Pedido pedido = PedidoFactory.criaNovoPedido(cliente, estabelecimento, itens);

        Cliente cliente2 = new Cliente("999", new GeoJsonPoint(-30.0376115, -51.1941124));
        Estabelecimento estabelecimento2 = new Estabelecimento("777", "Nono Ludovico", "Porto Alegre", new GeoJsonPoint(-30.0375048, -51.1896524), "pizza");

        List<ItemPedido> itens2 = new ArrayList<>();

        Pedido pedido2 = new Pedido(cliente2, estabelecimento2, itens, LocalDate.now(), PedidoStatus.EM_PREPARO);
        pedido.setPedidoId("12345");

        Entregador entregador1 = new Entregador("111perto", new GeoJsonPoint(-30.0379782, -51.1978455));
        Entregador entregador2 = new Entregador("222muito longe", new GeoJsonPoint(-30.0458515,-51.1089538));
        Entregador entregador3 = new Entregador("333perto", new GeoJsonPoint(-30.0432194,-51.2018124));

        List<Entregador> entregadores = new ArrayList<>();
        entregadores.add(entregador1);
        entregadores.add(entregador2);
        entregadores.add(entregador3);

        pedidoRepository.save(pedido2);

        gerenciadorRota.enviaProblemaDeRotaParaCalcular(pedido2, entregadores);

		return new PedidoResponseDto("1", "entregador", 10, 30, LocalDate.now());
	}

    public void getPedido(String id) {

        Optional<Pedido> byPedidoId = pedidoRepository.findById(id);

        gerenciadorRota.retornaSolucaoDeRota(byPedidoId.get());
    }
}
