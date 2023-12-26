package com.qph.facturacion.repository;

import com.qph.facturacion.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

    List<Pedido> findByIdFactura(Long idFactura);
}
