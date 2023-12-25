package com.qph.facturacion.service;

import com.qph.facturacion.entity.Producto;
import com.qph.facturacion.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ProductoService {
    @Autowired
    ProductoRepository productoRepository;

    public List<Producto> getProductos() {
        return productoRepository.findAll();
    }

    public Optional<Producto> getProducto(Long idProducto) {
        return productoRepository.findById(idProducto);
    }

    public ResponseEntity<Object> newProducto(Producto producto) {
        Optional<Producto> res = getProducto(producto.getSku());
        if (res.isEmpty()) {
            productoRepository.save(producto);
            return new ResponseEntity<>(
                    producto,
                    HttpStatus.OK
            );
        } else {
            return new ResponseEntity<>(
                    HttpStatus.CONFLICT
            );
        }

    }

    public void delete(Long idProducto) {
        productoRepository.deleteById(idProducto);
    }
}
