package com.devwarrios.mapfood.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
import com.devwarrios.mapfood.repository.ProdutoRepository;

@Service
public class PedidoService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private EstabelecimentoRepository estabelecimentoRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;

	public PedidoResponseDto criaPedido(PedidoRequestDto pedidoRequestDto) {
		Integer clienteId = pedidoRequestDto.getClienteId();
		String estabelecimentoId = pedidoRequestDto.getEstabelecimentoId();

		Optional<Cliente> cliente = null;
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

		return new PedidoResponseDto("1", "entregador", 10, 30, LocalDate.now());
	}
}
