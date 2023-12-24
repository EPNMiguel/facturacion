package com.qph.facturacion.controller;

import com.qph.facturacion.entity.Cliente;
import com.qph.facturacion.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path = "api/v1/client")

public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping("/{idCliente}")
    public Cliente getOne(String idCliente) {
        return clienteService.getCliente(idCliente);

    }

    @PostMapping
    public void setOrUpdate(@RequestBody Cliente cliente) {
        clienteService.saveOrUpdate(cliente);
    }
        @DeleteMapping("/{idCliente}")
    public void delete(@PathVariable("idCliente") int idCliente) {
        clienteService.delete(idCliente);
    }
}
