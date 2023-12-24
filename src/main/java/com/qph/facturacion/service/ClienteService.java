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

    public List<Cliente> getClientes() {
        return clienteRepository.findAll();
    }

    public Cliente getCliente(String cedula) {
        Cliente cliRes = null;
        List<Cliente> clienteList = clienteRepository.findAll();
        for (int i = 0; i < clienteList.size(); i++) {
            if (clienteList.get(i).getCedula().equals(cedula)) {
                cliRes = clienteList.get(i);
            }
        }
        return cliRes;
    }

    public void saveOrUpdate(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    public void delete(Integer idCliente) {
        clienteRepository.deleteById(idCliente);
    }
}
