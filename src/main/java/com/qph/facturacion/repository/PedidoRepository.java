package com.qph.facturacion.repository;

import com.qph.facturacion.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
}
