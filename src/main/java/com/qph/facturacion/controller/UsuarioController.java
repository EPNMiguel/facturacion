package com.qph.facturacion.controller;

import com.qph.facturacion.entity.Usuario;
import com.qph.facturacion.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(path = "api/v1/usuario")
public class UsuarioController {
    @Autowired
    private  UsuarioService usuarioService ;
    @GetMapping("/{user}/{pass}")
    public boolean ValidaEntrada(@PathVariable("user")String user, @PathVariable("pass") String pass){
        return usuarioService.ValidaEntrada(user, pass );
    }
}
