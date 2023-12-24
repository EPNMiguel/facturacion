package com.qph.facturacion.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "cliente")

public class Cliente {

    @Id
    @Column(name = "cedula" , unique = true, nullable = false)
    private String cedula;

    @Column(name = "nombre" , unique = false , nullable = false)
    private String nombre;
    @Column(name = "apellido" , unique = false , nullable = false)
    private String apellido;

    @Column(name = "telefono" , unique = false , nullable = false)
    private String telefono;

    @Column(name = "correo" , unique = false , nullable = false)
    private String correo;
}
