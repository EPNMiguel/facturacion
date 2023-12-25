package com.qph.facturacion.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "pedido")
public class Pedido {

    @EmbeddedId
    private pedidoPK id;

    @Column (name = "cantidad" , unique = false , nullable = false)
    private int cantidad;
    @Column (name = "subtotal" , unique = false , nullable = false)
    private BigDecimal subtotal;
    @Column (name = "iva" , unique = false , nullable = false)
    private BigDecimal iva;
    @Column (name = "total" , unique = false , nullable = false)
    private BigDecimal total;

    @ManyToOne()
    @JoinColumn(name = "id_factura", insertable = false , updatable = false)
    @MapsId("idFactura")
    private Factura factura;

}

@Embeddable
  class pedidoPK {

    @Column(name = "id_factura")
    private int idFactura;
    @Column(name = "id_producto")
    private int idProducto;


}