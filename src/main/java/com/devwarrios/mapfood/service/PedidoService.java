package com.devwarrios.mapfood.service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devwarrios.mapfood.dto.factory.PedidoDtoFactory;
import com.devwarrios.mapfood.dto.request.ItemPedidoDto;
import com.devwarrios.mapfood.dto.request.PedidoRequestDto;
import com.devwarrios.mapfood.dto.request.PedidoUpdateRequestDto;
import com.devwarrios.mapfood.dto.response.PedidoAtualizadoResponseDto;
import com.devwarrios.mapfood.dto.response.PedidoRecebidoResponseDto;
import com.devwarrios.mapfood.dto.response.PedidoResponseDto;
import com.devwarrios.mapfood.model.Entrega;
import com.devwarrios.mapfood.model.Entregador;
import com.devwarrios.mapfood.model.Estabelecimento;
import com.devwarrios.mapfood.model.ItemPedido;
import com.devwarrios.mapfood.model.Pedido;
import com.devwarrios.mapfood.model.PedidoStatus;
import com.devwarrios.mapfood.model.Produto;
import com.devwarrios.mapfood.model.factory.EntregaFactory;
import com.devwarrios.mapfood.model.factory.PedidoFactory;
import com.devwarrios.mapfood.repository.ClienteRepository;
import com.devwarrios.mapfood.repository.EstabelecimentoRepository;
import com.devwarrios.mapfood.repository.PedidoRepository;
import com.devwarrios.mapfood.utils.GerenciadorEstabelecimento;
import com.devwarrios.mapfood.utils.GerenciadorPedido;
import com.devwarrios.mapfood.utils.GerenciadorTempo;

@Service
public class PedidoService {

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private EstabelecimentoRepository estabelecimentoRepository;

	@Autowired
	private PedidoRepository pedidoRepository;

	/*
	 * @Autowired private EntregadorRepository entregadorRepository;
	 */

	@Autowired
	private EntregadorService entregadorService;

	public PedidoResponseDto criaPedido(PedidoRequestDto pedidoRequestDto) throws ErroResponseException {
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
		} catch (IndexOutOfBoundsException e) {
			throw new EstabelecimentoInexistenteException(estabelecimentoId);
		}

		GerenciadorEstabelecimento gerenciadorEstabelecimento = new GerenciadorEstabelecimento(estabelecimento);

		List<ItemPedidoDto> itensDto = pedidoRequestDto.getItens();

		itens = new ArrayList<>();
		Produto produto;

		for (ItemPedidoDto ipd : itensDto) {
			try {
				produto = gerenciadorEstabelecimento.buscaProdutoPorId(ipd.getProdutoId());
			} catch (NoSuchElementException e) {
				throw new ProdutoInexistenteException(ipd.getProdutoId());
			}

			itens.add(new ItemPedido(produto, ipd.getQuantidade(), ipd.getObservacao()));
		}

		Pedido pedido = PedidoFactory.criaNovoPedido(clienteId, estabelecimentoId, itens);

		double valorTotal = pedido.getValorTotal();

		pedidoRepository.insert(pedido);

		return new PedidoRecebidoResponseDto(pedido.getPedidoId(), pedido.getStatus().toString(), valorTotal,
				pedido.getAtualizadoEm());
	}

	public PedidoAtualizadoResponseDto atualizaPedido(PedidoUpdateRequestDto pedidoUpdateDto)
			throws ErroResponseException {
		GerenciadorPedido gerenciadorPedido = new GerenciadorPedido();

		String novoStatus = pedidoUpdateDto.getStatus();

		PedidoStatus status;
		try {
			status = gerenciadorPedido.converteParaPedidoStatus(novoStatus);
		} catch (IllegalArgumentException e) {
			throw new StatusPedidoInvalidoException(novoStatus);
		}

		String pedidoId = pedidoUpdateDto.getPedidoId();

		if (!pedidoRepository.existsByPedidoId(pedidoId)) {
			throw new PedidoInexistenteException(pedidoId);
		}

		Pedido pedido = pedidoRepository.findByPedidoId(pedidoId);

		if (!gerenciadorPedido.transicaoValida(pedido.getStatus(), status)) {
			throw new TransicaoStatusPedidoInvalidaException();
		}

		switch (status) {
		case EM_PREPARO:
			pedidoRepository.save(pedido);
			break;
		case PRONTO:
			pedidoRepository.save(pedido);
			break;
		case EM_TRANSITO:
			Estabelecimento estabelecimento;
			String estabelecimentoId = pedido.getEstabelecimentoId();

			if (!estabelecimentoRepository.existsByEstabelecimentoId(estabelecimentoId)) {
				throw new EstabelecimentoInexistenteException(estabelecimentoId);
			}

			try {
				estabelecimento = estabelecimentoRepository.findByEstabelecimentoId(estabelecimentoId).get(0);
			} catch (IndexOutOfBoundsException e) {
				throw new EstabelecimentoInexistenteException(estabelecimentoId);
			}

			int quantidadeTotal = pedido.getItens().stream().map(ItemPedido::getQuantidade).reduce(0,
					(acc, qtd) -> acc + qtd);

			Entregador entregador = entregadorService
					.buscaEntregadorDisponivelMaisProximo(estabelecimento.getLocalizacao(), quantidadeTotal);

			Random random = new Random();

			Double distancia_destino = random.nextDouble() * (10 - 1) + 1;
			Double eta = random.nextDouble() * (100 - 15) + 15;

			Entrega entrega = EntregaFactory.criaEntrega(entregador.getEntregadorId(), distancia_destino, eta);

			pedido.setEntrega(entrega);

			break;
		case ENTREGUE:
			pedido.getEntrega().setEta(0.0);
			pedido.setFinalizadoEm(GerenciadorTempo.agora());

			break;
		default:
			throw new StatusPedidoInvalidoException(novoStatus);
		}

		pedido.setStatus(status);
		pedido.setAtualizadoEm(GerenciadorTempo.agora());

		pedidoRepository.save(pedido);

		return new PedidoAtualizadoResponseDto(pedido.getPedidoId(), pedido.getStatus().toString(),
				pedido.getAtualizadoEm());
	}

	public PedidoResponseDto buscaPedido(String pedidoId) throws ErroResponseException {
		if (!pedidoRepository.existsByPedidoId(pedidoId)) {
			throw new PedidoInexistenteException(pedidoId);
		}

		Pedido pedido = pedidoRepository.findByPedidoId(pedidoId);

		return PedidoDtoFactory.criaPedidoStatusResponseDto(pedido);
	}
}
