package com.qph.facturacion.service;

import com.qph.facturacion.entity.Proveedor;
import com.qph.facturacion.repository.ProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProveedorService {

    @Autowired
    ProveedorRepository proveedorRepository;

    public List<Proveedor> getProveedores() {
        return proveedorRepository.findAll();
    }

    public Optional<Proveedor> getProveedor(String idProveedor) {
        return proveedorRepository.findById(idProveedor);
    }

    public void saveOrUpdate(Proveedor proveedor) {
        proveedorRepository.save(proveedor);
    }

    public void delete(String idProveedor) {
        proveedorRepository.deleteById(idProveedor);
    }
}
