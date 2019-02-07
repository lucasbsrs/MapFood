package com.devwarrios.mapfood.service;

import com.devwarrios.mapfood.model.Cliente;
import com.devwarrios.mapfood.model.Estabelecimento;
import com.devwarrios.mapfood.repository.ClienteRepository;
import com.devwarrios.mapfood.repository.EstabelecimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.Metrics;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstabelecimentoService {

    @Autowired
    private EstabelecimentoRepository estabelecimentoRepository;
    @Autowired
    private ClienteRepository clienteRepository;

    private List<Estabelecimento> estabelecimentos;

    public List<Estabelecimento> getEstabelecimentos() {
        return estabelecimentoRepository.findAll();
    }

    public List<Estabelecimento> getEstabelecimentosPorLocalizacao(Integer clienteId, Double raioEmKm) {

        Cliente cliente =  null;

        try {
            System.out.println(clienteId);
            cliente = clienteRepository.findByClienteId(clienteId);

            Distance distance = new Distance(5, Metrics.KILOMETERS);
            GeoJsonPoint point = new GeoJsonPoint(-51.228496,-30.03742831);

            estabelecimentos= estabelecimentoRepository
                    .findAllByLocationNear(point, distance);


        } catch (Exception e) {
            e.printStackTrace();
        }
        //System.out.println(cliente.getLocalizacao().getCoordinates().get(0));
        //return estabelecimentoRepository.findAll();

//        repository.findBySubjectAndLocationNear(subjects,
//                new Point(Double.valueOf(longitude), Double.valueOf(latitude)),
//                new Distance(distance, Metrics.KILOMETERS));



        return estabelecimentos;
    }


}
