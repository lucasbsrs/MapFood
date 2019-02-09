package com.devwarrios.mapfood.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devwarrios.mapfood.dto.ItemPedidoDto;
import com.devwarrios.mapfood.dto.PedidoRequestDto;
import com.devwarrios.mapfood.dto.PedidoResponseDto;
import com.devwarrios.mapfood.dto.factory.PedidoFactory;
import com.devwarrios.mapfood.model.Cliente;
import com.devwarrios.mapfood.model.Entregador;
import com.devwarrios.mapfood.model.Estabelecimento;
import com.devwarrios.mapfood.model.ItemPedido;
import com.devwarrios.mapfood.model.Pedido;
import com.devwarrios.mapfood.model.Produto;
import com.devwarrios.mapfood.repository.ClienteRepository;
import com.devwarrios.mapfood.repository.EntregadorRepository;
import com.devwarrios.mapfood.repository.EstabelecimentoRepository;
import com.devwarrios.mapfood.repository.PedidoRepository;
import com.devwarrios.mapfood.utils.GerenciadorEntrega;
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

	public PedidoResponseDto criaPedido(PedidoRequestDto pedidoRequestDto) {
		String clienteId = pedidoRequestDto.getClienteId();
		String estabelecimentoId = pedidoRequestDto.getEstabelecimentoId();

		Cliente cliente = null;
		Estabelecimento estabelecimento = null;
		List<ItemPedido> itens = null;

		try {
			cliente = clienteRepository.findByClienteId(clienteId);
		} catch (Exception e) {
			e.printStackTrace();
		}

		int quantidadeTotal = 0;
		try {
			estabelecimento = estabelecimentoRepository.findByEstabelecimentoId(estabelecimentoId).get(0);

			GerenciadorEstabelecimento gerenciadorEstabelecimento = new GerenciadorEstabelecimento(estabelecimento);

			List<ItemPedidoDto> itensDto = pedidoRequestDto.getItens();

			itens = new ArrayList<>();
			for (ItemPedidoDto ipd : itensDto) {
				Produto produto = gerenciadorEstabelecimento.buscaProdutoPorId(ipd.getProdutoId());

				itens.add(new ItemPedido(produto, ipd.getQuantidade(), ipd.getObservacao()));
				
				quantidadeTotal += ipd.getQuantidade();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		Pedido pedido = PedidoFactory.criaNovoPedido(clienteId, estabelecimentoId, itens);
		
		GerenciadorEntrega gerenciadorEntrega = new GerenciadorEntrega(this.entregadorRepository);
		
		double valorTotal = pedido.getValorTotal();
		
		Entregador entregador = gerenciadorEntrega.buscaEntregadorDisponivelMaisProximo(estabelecimento.getLocalizacao(), quantidadeTotal);

		try {
			entregadorService.decrementaCapacidadeDisponivel(entregador.getEntregadorId(), quantidadeTotal);
		} catch (CapacidadeDoEntregadorInvalidaException e) {
			e.printStackTrace();
		}
		
		pedidoRepository.insert(pedido);

		return new PedidoResponseDto(pedido.getPedidoId(), entregador.getEntregadorId(), 10, 30, valorTotal, pedido.getAtualizadoEm());
	}
}
