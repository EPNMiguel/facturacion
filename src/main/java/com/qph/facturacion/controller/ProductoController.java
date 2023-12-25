package com.qph.facturacion.controller;

import com.qph.facturacion.entity.Producto;
import com.qph.facturacion.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path = "api/v1/producto")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping
    public List<Producto> getAll() {
        return productoService.getProductos();
    }

    @GetMapping("/{idProducto}")
    public Optional<Producto> getOne(@PathVariable Long idProducto) {
        return productoService.getProducto(idProducto);
    }

    @PostMapping
    public ResponseEntity<Object> crearProducto(@RequestBody Producto producto) {
        return productoService.newProducto(producto);
    }

    @DeleteMapping("/{idProducto}")
    public void delete(@PathVariable("idProducto") Long idProducto) {
        productoService.delete(idProducto);
    }
}
