package com.devwarrios.mapfood.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devwarrios.mapfood.model.Estabelecimento;

@Repository
public interface EstabelecimentoRepository extends JpaRepository<Estabelecimento, Long> {
	public List<Estabelecimento> findByEstabelecimentoId(String estabelecimentoId);
}
