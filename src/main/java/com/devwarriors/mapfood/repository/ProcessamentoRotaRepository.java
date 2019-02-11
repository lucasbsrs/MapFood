package com.devwarriors.mapfood.repository;

import com.devwarriors.mapfood.mapa.ProcessamentoRota;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ProcessamentoRotaRepository extends MongoRepository<ProcessamentoRota, String> {

    Optional<ProcessamentoRota> findByPedidoPedidoId(String pedidoId);
}
