package com.qph.facturacion.controller;

import com.qph.facturacion.entity.Usuario;
import com.qph.facturacion.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping(path = "api/v1/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/valida")
    public boolean ValidaEntrada(@RequestBody Usuario user) {
        return usuarioService.ValidaEntrada(user.getUser(), user.getPassword());
    }
}
