package com.qph.facturacion.entity;

import jakarta.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario" , unique = true, nullable = false)
private int idUsuario;
    @Column(name = "user" , unique = true, nullable = false)
private String user;
    @Column(name = "password" , unique = true, nullable = false)
private String password;
    @Column(name = "rol" , unique = false, nullable = false)
private int rol;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }
}
