package com.qph.facturacion.controller;

import com.qph.facturacion.entity.Pedido;
import com.qph.facturacion.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/pedido")

public class PedidoController {
    @Autowired
    private PedidoService pedidoService;

    @GetMapping("/{idPedido}")
    public Optional<Pedido> getOne(int idPedido) {
        return pedidoService.getPedido(idPedido);

    }

    @PostMapping
    public void setOrUpdate(@RequestBody Pedido pedido) {
        pedidoService.saveOrUpdate(pedido);
    }

    @DeleteMapping("/{idPedido}")
    public void delete(@PathVariable("idPedido") int idPedido) {
        pedidoService.delete(idPedido);
    }

}
