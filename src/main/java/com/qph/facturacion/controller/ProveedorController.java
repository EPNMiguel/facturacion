package com.qph.facturacion.controller;

import com.qph.facturacion.entity.Proveedor;
import com.qph.facturacion.service.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path = "api/v1/proveedor")

public class ProveedorController {
    @Autowired
    private ProveedorService proveedorService;

    @GetMapping("/{idProveedor}")
    public Optional<Proveedor> getOne(String idProveedor) {
        return proveedorService.getProveedor(idProveedor);

    }

    @PostMapping
    public void setOrUpdate(@RequestBody Proveedor proveedor) {
        proveedorService.saveOrUpdate(proveedor);
    }

    @DeleteMapping("/{idProveedor}")
    public void delete(@PathVariable("idProveedor") String idProveedor) {
        proveedorService.delete(idProveedor);
    }
}