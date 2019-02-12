package com.devwarriors.mapfood.repository;

import com.devwarriors.mapfood.mapa.ProcessamentoRota;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProcessamentoRotaRepository extends MongoRepository<ProcessamentoRota, String> {

	Optional<ProcessamentoRota> findByPedidoPedidoId(String pedidoId);
}
