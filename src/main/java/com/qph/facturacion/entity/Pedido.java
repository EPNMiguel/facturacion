package com.qph.facturacion.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPedido" , unique = true, nullable = false)
    private int idPedido;
    @Column(name = "idFactura" , unique = true, nullable = false)
    private int idFactura;
    @Column(name = "idProducto" , unique = true, nullable = false)
    private int idProducto;
    @Column(name = "cantidadProducto" , unique = true, nullable = false)
    private int  cantidadProducto;

}

