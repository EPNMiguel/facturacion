package com.qph.facturacion.repository;

import com.qph.facturacion.entity.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProveedorRepository extends JpaRepository<Proveedor, String> {
}
