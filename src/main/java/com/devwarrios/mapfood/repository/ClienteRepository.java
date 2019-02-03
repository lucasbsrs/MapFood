package com.devwarrios.mapfood.repository;

import com.devwarrios.mapfood.model.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends MongoRepository<Cliente, Long> {

}
