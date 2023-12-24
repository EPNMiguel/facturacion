package com.qph.facturacion.repository;

import com.qph.facturacion.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
}
