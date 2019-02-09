package com.devwarrios.mapfood.service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devwarrios.mapfood.dto.ItemPedidoDto;
import com.devwarrios.mapfood.dto.PedidoRecebidoResponseDto;
import com.devwarrios.mapfood.dto.PedidoRequestDto;
import com.devwarrios.mapfood.dto.PedidoResponseDto;
import com.devwarrios.mapfood.dto.factory.PedidoFactory;
import com.devwarrios.mapfood.model.Estabelecimento;
import com.devwarrios.mapfood.model.ItemPedido;
import com.devwarrios.mapfood.model.Pedido;
import com.devwarrios.mapfood.model.Produto;
import com.devwarrios.mapfood.repository.ClienteRepository;
import com.devwarrios.mapfood.repository.EntregadorRepository;
import com.devwarrios.mapfood.repository.EstabelecimentoRepository;
import com.devwarrios.mapfood.repository.PedidoRepository;
import com.devwarrios.mapfood.utils.GerenciadorEstabelecimento;

@Service
public class PedidoService {

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private EstabelecimentoRepository estabelecimentoRepository;

	@Autowired
	private PedidoRepository pedidoRepository;

	@Autowired
	private EntregadorRepository entregadorRepository;

	@Autowired
	private EntregadorService entregadorService;

	public PedidoResponseDto criaPedido(PedidoRequestDto pedidoRequestDto)
			throws EntidadeInexistenteException {
		String clienteId = pedidoRequestDto.getClienteId();
		String estabelecimentoId = pedidoRequestDto.getEstabelecimentoId();

		Estabelecimento estabelecimento = null;
		List<ItemPedido> itens = null;

		if (!clienteRepository.existsByClienteId(clienteId)) {
			throw new ClienteInexistenteException(clienteId);
		}
		
		if (!estabelecimentoRepository.existsByEstabelecimentoId(estabelecimentoId)) {
			throw new EstabelecimentoInexistenteException(estabelecimentoId);
		}

		try {
			estabelecimento = estabelecimentoRepository.findByEstabelecimentoId(estabelecimentoId).get(0);
		}
		catch (IndexOutOfBoundsException e) {
			throw new EstabelecimentoInexistenteException(estabelecimentoId);
		}
		
		GerenciadorEstabelecimento gerenciadorEstabelecimento = new GerenciadorEstabelecimento(estabelecimento);

		List<ItemPedidoDto> itensDto = pedidoRequestDto.getItens();

		itens = new ArrayList<>();
		Produto produto;
		//int quantidadeTotal = 0;

		for (ItemPedidoDto ipd : itensDto) {
			try {
				produto = gerenciadorEstabelecimento.buscaProdutoPorId(ipd.getProdutoId());
			}
			catch (NoSuchElementException e) {
				throw new ProdutoInexistenteException(ipd.getProdutoId());
			}

			itens.add(new ItemPedido(produto, ipd.getQuantidade(), ipd.getObservacao()));
			
			//quantidadeTotal += ipd.getQuantidade();
		} 

		Pedido pedido = PedidoFactory.criaNovoPedido(clienteId, estabelecimentoId, itens);
		
		double valorTotal = pedido.getValorTotal();
		
		//Entregador entregador = entregadorService.buscaEntregadorDisponivelMaisProximo(estabelecimento.getLocalizacao(), quantidadeTotal);
		
		pedidoRepository.insert(pedido);

		return new PedidoRecebidoResponseDto(pedido.getPedidoId(), valorTotal, pedido.getAtualizadoEm());
	}
}
