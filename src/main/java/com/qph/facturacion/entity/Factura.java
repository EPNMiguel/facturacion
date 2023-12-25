package com.qph.facturacion.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "factura")
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_factura" , unique = true, nullable = false)
    private long idFactura;

    @ManyToOne()
    @JoinColumn(name = "id_cliente" , nullable = false)
    private Cliente cliente;

    @Column(name = "fecha" , nullable = false , insertable = true , updatable = false)
    @CreationTimestamp
    private LocalDateTime creationDate ;

    @OneToMany(mappedBy = "factura" ,cascade = CascadeType.PERSIST)
    private List<Pedido> pedidos;
}
