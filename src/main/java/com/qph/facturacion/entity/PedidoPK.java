package com.qph.facturacion.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class PedidoPK {

    @Column(name = "idfactura")
    private long idfactura;
    @Column(name = "sku")
    private long sku;


}
