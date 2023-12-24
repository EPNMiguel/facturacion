package com.qph.facturacion.service;

import com.qph.facturacion.entity.Cliente;
import com.qph.facturacion.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {
    @Autowired
    ClienteRepository clienteRepository;

    public List<Cliente> getClientes(){
        return clienteRepository.findAll();
    }

    public Optional<Cliente> getCliente(Integer cedula){
        return  clienteRepository.findById(cedula);
    }

    public void saveOrUpdate(Cliente cliente){
        clienteRepository.save(cliente);
    }

    public void delete(Integer cedula){
        clienteRepository.deleteById(cedula);
    }
}
