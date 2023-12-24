package com.qph.facturacion.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "factura")
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idFactura" , unique = true, nullable = false)
    private int idFactura;
    @Column(name = "idCliente" , unique = false, nullable = false)
    private String idCliente;
    @Column(name = "idPedido" , unique = false, nullable = false)
    private int idPedido;
    @Column(name = "idProveedor" , unique = false, nullable = false)
    private String  idProveedor;
}
