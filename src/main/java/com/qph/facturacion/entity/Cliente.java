package com.qph.facturacion.entity;

import jakarta.persistence.*;
import lombok.Data;


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

    @Column(name = "direccion" , unique = false , nullable = false)
    private String direccion;

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
