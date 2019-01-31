package com.devwarrios.mapfood.dto.factory;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.devwarrios.mapfood.dto.ItemPedidoDto;
import com.devwarrios.mapfood.dto.PedidoRequestDto;
import com.devwarrios.mapfood.model.Cliente;
import com.devwarrios.mapfood.model.Estabelecimento;
import com.devwarrios.mapfood.model.ItemPedido;
import com.devwarrios.mapfood.model.Pedido;
import com.devwarrios.mapfood.model.PedidoStatus;
import com.devwarrios.mapfood.model.Produto;
import com.devwarrios.mapfood.repository.ClienteRepository;
import com.devwarrios.mapfood.repository.EstabelecimentoRepository;
import com.devwarrios.mapfood.repository.ProdutoRepository;

public class PedidoFactory {

	@Autowired
	private static ProdutoRepository produtoRepository;

	@Autowired
	private static ClienteRepository clienteRepository;

	@Autowired
	private static EstabelecimentoRepository estabelecimentoRepository;

	public static Pedido criaPedido(PedidoRequestDto pedidoRequestDto) {
		// Mover boa parte dessa logica para um Service.
		String clienteId = pedidoRequestDto.getClienteId();
		String estabelecimentoId = pedidoRequestDto.getEstabelecimentoId();

		Cliente cliente = clienteRepository.findByClienteId(clienteId).get(0);
		Estabelecimento estabelecimento = estabelecimentoRepository.findByEstabelecimentoId(estabelecimentoId)
				.get(0);

		List<ItemPedidoDto> itensDto = pedidoRequestDto.getItens();

		List<ItemPedido> itens = new ArrayList<>();
		for (ItemPedidoDto ipd : itensDto) {
			Produto produto = produtoRepository.findByProdutoId(ipd.getProdutoId()).get(0);

			itens.add(new ItemPedido(produto, ipd.getQuantidade(), ipd.getObservacao()));
		}

		Pedido pedido = new Pedido(cliente, estabelecimento, itens, LocalDate.now(), PedidoStatus.EM_PREPARO);

		return pedido;
	}
}
