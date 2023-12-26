package com.qph.facturacion.service;

import com.qph.facturacion.entity.Cliente;
import com.qph.facturacion.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class ClienteService {
    @Autowired
    ClienteRepository clienteRepository;

    public List<Cliente> getClientes() {
        return clienteRepository.findAll();
    }

    public List<Cliente> getCliente(String cedula) {
        return clienteRepository.findByCedula(cedula);
    }

    public Map<String, Integer> save(Cliente cliente) {
        HashMap<String, Integer> map = new HashMap<>();

        List<Cliente> res = clienteRepository.findByCedula(cliente.getCedula());
        System.out.println(" cliente.getCedula()" + cliente.getCedula());

        if (res.isEmpty()) {
            System.out.println("Estoy vacio, debo guardar cliente");
            clienteRepository.save(cliente);
            map.put("rol", 1);

        } else {
            System.out.println("Estoy lleno, no hago nada");
            map.put("rol", 0);
        }
        return map;

    }

    public ResponseEntity<Object> update(Cliente cliente) {
        List<Cliente> res = clienteRepository.findByCedula(cliente.getCedula());
        if (!res.isEmpty()) {
            clienteRepository.save(cliente);
            return new ResponseEntity<>(
                    HttpStatus.OK
            );
        } else {
            return new ResponseEntity<>(
                    HttpStatus.CONFLICT
            );
        }
    }

}
