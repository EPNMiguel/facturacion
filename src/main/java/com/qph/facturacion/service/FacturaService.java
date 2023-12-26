package com.qph.facturacion.service;


import com.qph.facturacion.entity.Factura;
import com.qph.facturacion.repository.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Console;
import java.util.List;
import java.util.Optional;

@Service
public class FacturaService {

    @Autowired
    FacturaRepository facturaRepository;

    public List<Factura> getFacturas() {
        return facturaRepository.findAll();
    }

    public Optional<Factura> getFactura(Long idFactura) {
        return facturaRepository.findById(idFactura);
    }

    public void guardarFactura(Factura factura) {
        facturaRepository.save(factura);
    }


}
