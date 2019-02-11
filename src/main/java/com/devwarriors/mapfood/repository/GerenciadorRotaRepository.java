package com.devwarriors.mapfood.repository;

import com.devwarriors.mapfood.mapa.GerenciadorRota;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GerenciadorRotaRepository extends MongoRepository<GerenciadorRota, String> {
}
