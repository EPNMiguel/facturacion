package com.qph.facturacion.controller;

import com.qph.facturacion.entity.Cliente;
import com.qph.facturacion.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path = "api/v1/client")

public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping("/{idCliente}")
    public List<Cliente> getCliente(@PathVariable String idCliente) {
        System.out.println("entro");
        return clienteService.getCliente(idCliente);
    }

    @GetMapping()
    public List<Cliente> getClientes(){
        return clienteService.getClientes();
    }


    @PostMapping
    public ResponseEntity<Object> saveCliente(@RequestBody Cliente cliente) {
        return clienteService.save(cliente);
    }

    @PutMapping
    public ResponseEntity<Object> UpdateCliente(@RequestBody Cliente cliente) {
        return clienteService.update(cliente);
    }

}
