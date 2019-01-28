package com.devwarrios.mapfood.controller;

import com.devwarrios.mapfood.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ClienteController {

    @GetMapping("/clientes")
    public List<Cliente> getClientes(){

        //simula dados obtidos do ClienteRepository
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente(1, 50.0, 60.0));
        clientes.add(new Cliente(2, 50.0, 60.0));

        return clientes;
    }
}
