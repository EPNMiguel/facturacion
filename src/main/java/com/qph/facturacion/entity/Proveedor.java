package com.qph.facturacion.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "proveedor")
public class Proveedor {

    @Id
    @Column(name = "RUC" , unique = true, nullable = false)
    private String RUC;
    @Column(name = "razonSocial" , unique = true, nullable = false)
    private String razonSocial;
    @Column(name = "direccion" , unique = false, nullable = false)
    private String direccion;

}
