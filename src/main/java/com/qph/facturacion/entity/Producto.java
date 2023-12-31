package com.qph.facturacion.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "producto")
public class Producto  implements Serializable {

    @Id
    @Column(name = "sku" , unique = true, nullable = false)
    private long sku;
    @Column(name = "descripcion" , unique = false, nullable = false)
    private String descripcion;
    @Column(name = "precio" , unique = false, nullable = false)
    private double precio;
    @Column(name = "IVA" , unique = false, nullable = false)
    private byte iva;

    public long getSku() {
        return sku;
    }

    public void setSku(long sku) {
        this.sku = sku;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public byte getIva() {
        return iva;
    }

    public void setIva(byte iva) {
        this.iva = iva;
    }
}
