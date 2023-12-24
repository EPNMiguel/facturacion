package com.qph.facturacion.service;

import com.qph.facturacion.entity.Usuario;
import com.qph.facturacion.repository.UsuarioRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
@Autowired
    UsuarioRepository usuarioRepository;

public boolean ValidaEntrada(String user, String pass){
    boolean res = false;
    List<Usuario> userList =usuarioRepository.findAll();
  for(int i = 0; i<userList.size();i++){
      System.out.println(i + " userList.get(i): " + userList.get(i));
      if(userList.get(i).getUser().equals(user)){
          System.out.println("USER CORRECTO ");
          if(userList.get(i).getPassword().equals(pass)){
              System.out.println("PASS CORRECTO ");
              res = true;
              break;
          }
      }
  }
    return res;
}
}
