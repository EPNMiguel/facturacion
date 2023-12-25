package com.qph.facturacion.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;


@Embeddable
public class PedidoPK {

    @Column(name = "id_factura")
    private Long idFactura;
    @Column(name = "id_producto")
    private Long idProducto;


}
