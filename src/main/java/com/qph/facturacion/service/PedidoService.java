package com.qph.facturacion.service;

import com.qph.facturacion.entity.Pedido;
import com.qph.facturacion.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {
    @Autowired
    PedidoRepository pedidoRepository;

    public List<Pedido> getPedidos() {
        return pedidoRepository.findAll();
    }

    public Optional<Pedido> getPedido(Integer idFactura) {
        return pedidoRepository.findById(idFactura);
    }

    public void saveOrUpdate(Pedido pedido) {
        pedidoRepository.save(pedido);
    }

    public void delete(Integer idPedido) {
        pedidoRepository.deleteById(idPedido);
    }


}
