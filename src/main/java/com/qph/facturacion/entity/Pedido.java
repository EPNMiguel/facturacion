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

    @EmbeddedId
    private PedidoPK id;

    @Column(name = "cantidad", unique = false, nullable = false)
    private int cantidad;
    @Column(name = "subtotal", unique = false, nullable = false)
    private BigDecimal subtotal;
    @Column(name = "iva", unique = false, nullable = false)
    private BigDecimal iva;
    @Column(name = "total", unique = false, nullable = false)
    private BigDecimal total;

    @ManyToOne()
    @JoinColumn(name = "id_factura", insertable = false, updatable = false)
    @MapsId("idFactura")
    @ToString.Exclude
    private Factura factura;

}
