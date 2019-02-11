package com.devwarriors.mapfood.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.devwarriors.mapfood.model.Pedido;
import com.devwarriors.mapfood.model.PedidoStatus;

public interface PedidoRepository extends MongoRepository<Pedido, String> {

	Pedido findByPedidoId(String pedidoId);

	boolean existsByPedidoId(String pedidoId);

	List<Pedido> findAllByEstabelecimentoIdAndCriadoEmBetween(String id, LocalDate dataInicial, LocalDate dataFinal);

	Long countByEstabelecimentoIdAndCriadoEmBetweenAndStatus(String id, LocalDate dataInicial, LocalDate dataFinal,
			PedidoStatus entregue);
}
