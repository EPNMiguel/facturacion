package com.qph.facturacion.service;

import com.qph.facturacion.entity.Usuario;
import com.qph.facturacion.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UsuarioService {
@Autowired
    UsuarioRepository usuarioRepository;

public Map<String, Integer> ValidaEntrada(String user, String pass){

    HashMap<String, Integer> map = new HashMap<>();
    map.put("rol", 0);
    List<Usuario> userList =usuarioRepository.findAll();
  for(int i = 0; i<userList.size();i++){
      System.out.println(i + " userList.get(i): " + userList.get(i));
      if(userList.get(i).getUser().equals(user)){
          System.out.println("USER CORRECTO ");
          if(userList.get(i).getPassword().equals(pass)){
              System.out.println("PASS CORRECTO ");
              map.put("rol", userList.get(i).getRol());
              break;
          }
      }
  }
    return map;
}
}
