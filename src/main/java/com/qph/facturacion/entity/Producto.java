package com.qph.facturacion.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SKU" , unique = true, nullable = false)
    private int idUsuario;
    @Column(name = "descripcion" , unique = true, nullable = false)
    private String descripcion;
    @Column(name = "precio" , unique = false, nullable = false)
    private double precio;
    @Column(name = "IVA" , unique = false, nullable = false)
    private byte iva;
}
