package com.qph.facturacion.controller;

import com.qph.facturacion.entity.Factura;
import com.qph.facturacion.entity.Pedido;
import com.qph.facturacion.service.FacturaService;
import com.qph.facturacion.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path = "api/v1/factura")

public class FacturaController {
    @Autowired
    private FacturaService facturaService;

     @GetMapping
     public List<Factura> getFacturas(){
         System.out.println("EntroBBB");
         return this.facturaService.getFacturas();
     }

    @GetMapping("/{idFactura}")
    public Optional<Factura> getOne(int idFactura) {
        return facturaService.getFactura(idFactura);

    }

    @PostMapping
    public void setOrUpdate(@RequestBody Factura factura) {
        facturaService.saveOrUpdate(factura);
    }

    @DeleteMapping("/{idFactura}")
    public void delete(@PathVariable("idFactura") int idFactura) {
        facturaService.delete(idFactura);
    }

}

