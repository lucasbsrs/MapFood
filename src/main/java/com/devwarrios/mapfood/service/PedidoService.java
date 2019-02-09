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
import com.devwarrios.mapfood.model.Estabelecimento;
import com.devwarrios.mapfood.model.ItemPedido;
import com.devwarrios.mapfood.model.Pedido;
import com.devwarrios.mapfood.model.Produto;
import com.devwarrios.mapfood.repository.ClienteRepository;
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

		try {
			estabelecimento = estabelecimentoRepository.findByEstabelecimentoId(estabelecimentoId).get(0);

			GerenciadorEstabelecimento gerenciadorEstabelecimento = new GerenciadorEstabelecimento(estabelecimento);

			List<ItemPedidoDto> itensDto = pedidoRequestDto.getItens();

			itens = new ArrayList<>();
			for (ItemPedidoDto ipd : itensDto) {
				Produto produto = gerenciadorEstabelecimento.buscaProdutoPorId(ipd.getProdutoId());

				itens.add(new ItemPedido(produto, ipd.getQuantidade(), ipd.getObservacao()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		Pedido pedido = PedidoFactory.criaNovoPedido(clienteId, estabelecimentoId, itens);

		pedidoRepository.insert(pedido);

		return new PedidoResponseDto(pedido.getPedidoId(), "entregador", 10, 30, 100.00, pedido.getData());
	}
}
