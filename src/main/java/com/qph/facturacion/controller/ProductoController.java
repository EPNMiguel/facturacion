package com.qph.facturacion.controller;

import com.qph.facturacion.entity.Producto;
import com.qph.facturacion.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path = "api/v1/producto")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("/{idProducto}")
    public Optional<Producto> getOne(Integer idProducto) {
        return productoService.getProducto(idProducto);

    }

    @PostMapping
    public void setOrUpdate(@RequestBody Producto producto) {
        productoService.saveOrUpdate(producto);
    }

    @DeleteMapping("/{idProducto}")
    public void delete(@PathVariable("idProducto") Integer idProducto) {
        productoService.delete(idProducto);
    }
}
