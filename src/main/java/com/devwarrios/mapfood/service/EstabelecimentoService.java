package com.devwarrios.mapfood.service;

import com.devwarrios.mapfood.model.Cliente;
import com.devwarrios.mapfood.model.Estabelecimento;
import com.devwarrios.mapfood.repository.ClienteRepository;
import com.devwarrios.mapfood.repository.EstabelecimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class EstabelecimentoService {

    @Autowired
    private EstabelecimentoRepository estabelecimentoRepository;
    @Autowired
    private ClienteRepository clienteRepository;


    public List<Estabelecimento> getEstabelecimentos() {
        return estabelecimentoRepository.findAll();
    }

    public List<Estabelecimento> getEstabelecimentosPorLocalizacao(Integer clienteId, Double raio) {

        try {
            Cliente cliente = clienteRepository.findByClienteId(clienteId);
            Distance distance = new Distance(raio * 1000);
            GeoJsonPoint point = new GeoJsonPoint(
                    new Point(
                            cliente.getLocalizacao().getCoordinates().get(0),
                            cliente.getLocalizacao().getCoordinates().get(1)
                    ));

            return estabelecimentoRepository.findAllByLocalizacaoNear(point, distance);

        } catch (Exception e) { e.printStackTrace(); }

        return Collections.emptyList();
    }
}
