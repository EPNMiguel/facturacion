package com.qph.facturacion.service;

import com.qph.facturacion.entity.Usuario;
import com.qph.facturacion.repository.UsuarioRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public ResponseEntity<Object> IngresaUsuario(Usuario usuario) {
        List<Usuario> res = usuarioRepository.findByUserName(usuario.getUserName());
        if(res.isEmpty()){
            usuarioRepository.save(usuario);
            return new ResponseEntity<>(
                    HttpStatus.OK
            );
        }else{
            return new ResponseEntity<>(
                    HttpStatus.CONFLICT
            );
        }

    }

    public Map<String, Integer> ValidaEntrada(String user, String pass) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("rol", 0);
        List<Usuario> userList = usuarioRepository.findAll();
        for (int i = 0; i < userList.size(); i++) {
            System.out.println(i + " userList.get(i): " + userList.get(i));
            if (userList.get(i).getUserName().equals(user)) {
                System.out.println("USER CORRECTO ");
                if (userList.get(i).getUserPass().equals(pass)) {
                    System.out.println("PASS CORRECTO ");
                    map.put("rol", 1);
                    break;
                }
            }
        }
        return map;
    }
}
