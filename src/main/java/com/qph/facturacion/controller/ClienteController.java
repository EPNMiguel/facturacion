package com.qph.facturacion.controller;

import com.qph.facturacion.entity.Cliente;
import com.qph.facturacion.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/client")

public class ClienteController {
    @Autowired
    private ClienteService clienteService;
    @GetMapping
    public List<Cliente> getAll(){
        return clienteService.getClientes();
    }
}
