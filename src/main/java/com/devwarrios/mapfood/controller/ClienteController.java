package com.devwarrios.mapfood.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.devwarrios.mapfood.model.Cliente;

@RestController
public class ClienteController {

    @RequestMapping(value = "/clientes", method = RequestMethod.GET)
    public List<Cliente> getClientes(){

        //simula dados obtidos do ClienteRepository
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente(1, 50.0, 60.0));
        clientes.add(new Cliente(2, 50.0, 60.0));

        return clientes;
    }
}
