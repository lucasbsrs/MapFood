package com.devwarrios.mapfood.repository;

import com.devwarrios.mapfood.model.Pedido;
import com.devwarrios.mapfood.model.PedidoStatus;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDate;
import java.util.List;

public interface PedidoRepository extends MongoRepository<Pedido, String> {

	Long countByEstabelecimentoIdAndDataBetweenAndStatus(String estabelecimentoId, LocalDate dataInicial, LocalDate dataFinal, PedidoStatus status);

	List<Pedido> findAllByEstabelecimentoIdAndDataBetween(String estabelecimentoId, LocalDate dataInicial, LocalDate dataFinal);
}
