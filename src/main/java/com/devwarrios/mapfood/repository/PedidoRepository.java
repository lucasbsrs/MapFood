package com.devwarrios.mapfood.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.devwarrios.mapfood.model.Pedido;

public interface PedidoRepository extends MongoRepository<Pedido, String> {

	Pedido findByPedidoId(String pedidoId);

	boolean existsByPedidoId(String pedidoId);
}
