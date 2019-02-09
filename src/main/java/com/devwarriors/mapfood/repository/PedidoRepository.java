package com.devwarriors.mapfood.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.devwarriors.mapfood.model.Pedido;
import com.devwarriors.mapfood.model.PedidoStatus;

import java.time.LocalDate;
import java.util.List;

public interface PedidoRepository extends MongoRepository<Pedido, String> {

	Long countByEstabelecimentoIdAndDataBetweenAndStatus(String estabelecimentoId, LocalDate dataInicial, LocalDate dataFinal, PedidoStatus status);

	List<Pedido> findAllByEstabelecimentoIdAndDataBetween(String estabelecimentoId, LocalDate dataInicial, LocalDate dataFinal);
}
