package com.devwarriors.mapfood.repository;

import com.devwarriors.mapfood.model.GerenciadorRota;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GerenciadorRotaRepository extends MongoRepository<GerenciadorRota, String> {
}
