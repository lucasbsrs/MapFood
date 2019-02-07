package com.devwarrios.mapfood.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devwarrios.mapfood.dto.ItemPedidoDto;
import com.devwarrios.mapfood.dto.PedidoRequestDto;
import com.devwarrios.mapfood.dto.PedidoResponseDto;
import com.devwarrios.mapfood.dto.factory.PedidoFactory;
import com.devwarrios.mapfood.model.Cliente;
import com.devwarrios.mapfood.model.Estabelecimento;
import com.devwarrios.mapfood.model.ItemPedido;
import com.devwarrios.mapfood.model.Pedido;
import com.devwarrios.mapfood.model.Produto;
import com.devwarrios.mapfood.repository.ClienteRepository;
import com.devwarrios.mapfood.repository.EstabelecimentoRepository;
import com.devwarrios.mapfood.repository.PedidoRepository;
import com.devwarrios.mapfood.repository.ProdutoRepository;
import com.devwarrios.mapfood.utils.GerenciadorEstabelecimento;

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

	public PedidoResponseDto criaPedido(PedidoRequestDto pedidoRequestDto) {
		String clienteId = pedidoRequestDto.getClienteId();
		String estabelecimentoId = pedidoRequestDto.getEstabelecimentoId();

		Cliente cliente = null;
		Estabelecimento estabelecimento = null;
		List<ItemPedido> itens = null;

		try {
			System.out.println(clienteId);
			cliente = clienteRepository.findByClienteId(clienteId);
		}
		catch (Exception e) {
			System.out.println("Cliente");
			e.printStackTrace();
		}

		try {
			estabelecimento = estabelecimentoRepository.findByEstabelecimentoId(estabelecimentoId)
					.get(0);

			GerenciadorEstabelecimento gerenciadorEstabelecimento = new GerenciadorEstabelecimento(estabelecimento);

			List<ItemPedidoDto> itensDto = pedidoRequestDto.getItens();

			/*
			List<String> itensIds = itensDto.stream().map(ipd -> ipd.getProdutoId()).collect(Collectors.toList());
			
			Stream<Produto> produtos = gerenciadorEstabelecimento.buscarProdutosPorId(itensIds);
			
			produtos.map(p -> )
			*/
			System.out.println("itensDto: " + itensDto);
			itens = new ArrayList<>();
			for (ItemPedidoDto ipd : itensDto) {
				Produto produto = gerenciadorEstabelecimento.buscaProdutoPorId(ipd.getProdutoId());
				System.out.println(produto);

				itens.add(new ItemPedido(produto, ipd.getQuantidade(), ipd.getObservacao()));
			}
		}
		catch (Exception e) {
			System.out.println("pedido");
			System.out.println(e);
			e.printStackTrace();
		}

		Pedido pedido = PedidoFactory.criaNovoPedido(clienteId, estabelecimentoId, itens);
		
		pedidoRepository.insert(pedido);

		return new PedidoResponseDto("1", "entregador", 10, 30, 100.00, LocalDate.now());
	}
}
