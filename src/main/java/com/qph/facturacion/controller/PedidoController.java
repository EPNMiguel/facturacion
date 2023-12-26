package com.qph.facturacion.controller;

import com.qph.facturacion.entity.Pedido;
import com.qph.facturacion.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path = "api/v1/pedido")

public class PedidoController {
    @Autowired
    private PedidoService pedidoService;

    @GetMapping
    public List<Pedido> getAll(Integer idPedido) {
        return pedidoService.getPedidos();

    }

    @GetMapping("/{idFactura}")
    public List<Pedido> getOne(@PathVariable Long idFactura) {
        return pedidoService.getPedido(idFactura);

    }

    @PostMapping
    public void saveOrUpdate(@RequestBody Pedido pedido) {
        pedidoService.saveOrUpdate(pedido);
    }

    @DeleteMapping("/{idPedido}")
    public void delete(@PathVariable("idPedido") int idPedido) {
        pedidoService.delete(idPedido);
    }

}
