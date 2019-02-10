package com.devwarriors.mapfood.repository;

import com.devwarriors.mapfood.model.Pedido;
import com.devwarriors.mapfood.model.PedidoStatus;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDate;
import java.util.List;

public interface PedidoRepository extends MongoRepository<Pedido, String> {
    List<Pedido> findAllByEstabelecimentoIdAndDataBetween(String id, LocalDate dataInicial, LocalDate dataFinal);

    Long countByEstabelecimentoIdAndDataBetweenAndStatus(String id, LocalDate dataInicial, LocalDate dataFinal, PedidoStatus entregue);
}
