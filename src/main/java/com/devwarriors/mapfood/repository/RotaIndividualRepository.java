package com.devwarriors.mapfood.repository;

import com.devwarriors.mapfood.mapa.RotaIndividual;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RotaIndividualRepository extends MongoRepository<RotaIndividual, String> {

	RotaIndividual findRotaIndividualByProblemaId(String id);
}
