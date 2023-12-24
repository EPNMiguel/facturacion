package com.qph.facturacion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin(origins = "http://localhost:4200")
@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(){
        return "index.html";
    }
}
