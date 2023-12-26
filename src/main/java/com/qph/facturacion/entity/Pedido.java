package com.qph.facturacion.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "pedido")
public class Pedido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPedido", unique = true, nullable = false)
    private long idPedido;

    @Column(name = "id_factura", unique = false, nullable = false)
    private long idFactura;

    @Column(name = "sku", unique = false, nullable = false)
    private long idProducto;

    @Column(name = "cantidad", unique = false, nullable = false)
    private int cantidad;
    @Column(name = "subtotal", unique = false, nullable = false)
    private double subtotal;
    @Column(name = "iva", unique = false, nullable = false)
    private int iva;
    @Column(name = "total", unique = false, nullable = false)
    private double total;
}
