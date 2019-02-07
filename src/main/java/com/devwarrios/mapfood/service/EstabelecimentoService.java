package com.devwarrios.mapfood.service;

import com.devwarrios.mapfood.model.Cliente;
import com.devwarrios.mapfood.model.Estabelecimento;
import com.devwarrios.mapfood.repository.ClienteRepository;
import com.devwarrios.mapfood.repository.EstabelecimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstabelecimentoService {

    @Autowired
    private EstabelecimentoRepository estabelecimentoRepository;
    @Autowired
    private ClienteRepository clienteRepository;

    public List<Estabelecimento> getEstabelecimentos() {
        return estabelecimentoRepository.findAll();
    }

    public List<Estabelecimento> getEstabelecimentosPorLocalizacao(Integer clienteId, Integer raioEmKm) {

        Optional<Cliente>cliente = null;

        try {
            System.out.println(clienteId);
            cliente = clienteRepository.findByClienteId(clienteId);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return estabelecimentoRepository.findAll();

        //return null;
    }


}
