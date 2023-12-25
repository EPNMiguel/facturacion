package com.qph.facturacion.controller;

import com.qph.facturacion.entity.Usuario;
import com.qph.facturacion.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Console;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:4200")
@RestController()
@RequestMapping(path = "api/v1/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/valida")
    public Map<String, Integer> validaEntrada(@RequestBody Usuario user) {
         return usuarioService.ValidaEntrada(user.getUserName(), user.getUserPass());
    }

    @PostMapping()
    public ResponseEntity<Object> ingresaUsuario(@RequestBody Usuario user){
        System.out.println("AAAAAAAAAAA");
        System.out.println(user.getUserName() );
        return usuarioService.IngresaUsuario(user);
    }


}
