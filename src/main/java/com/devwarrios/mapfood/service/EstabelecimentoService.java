package com.devwarrios.mapfood.service;

import com.devwarrios.mapfood.model.Cliente;
import com.devwarrios.mapfood.model.Estabelecimento;
import com.devwarrios.mapfood.repository.ClienteRepository;
import com.devwarrios.mapfood.repository.EstabelecimentoRepository;
import com.mongodb.client.model.geojson.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.Metrics;
import org.springframework.data.geo.Point;
import org.springframework.data.mapping.model.Property;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import static com.sun.xml.internal.ws.policy.sourcemodel.wspolicy.XmlToken.Optional;

@Service
public class EstabelecimentoService {

    @Autowired
    private EstabelecimentoRepository estabelecimentoRepository;
    @Autowired
    private ClienteRepository clienteRepository;


    public List<Estabelecimento> getEstabelecimentos() {
        return estabelecimentoRepository.findAll();
    }

    public List<Estabelecimento> getEstabelecimentosPorLocalizacao(Integer clienteId, Double raioEmKm) {

        Cliente cliente =  null;

        try {
            System.out.println(clienteId);
            cliente = clienteRepository.findByClienteId(clienteId);

        } catch (Exception e) {
            e.printStackTrace();
        }
        //System.out.println(cliente.getLocalizacao().getCoordinates().get(0));
        //return estabelecimentoRepository.findAll();


        Distance distance = new Distance(raioEmKm, Metrics.KILOMETERS);
        GeoJsonPoint point = new GeoJsonPoint(new Point(-51.228496,-30.03742831));


        List<Estabelecimento> estabelecimentos = estabelecimentoRepository.findAllByLocalizacaoNear(point, distance);

        return estabelecimentos;
    }


}
