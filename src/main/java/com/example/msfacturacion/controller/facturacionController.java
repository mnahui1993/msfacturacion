package com.example.msfacturacion.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/facturacion")
public class facturacionController {

    @GetMapping("/init")
    public String message(){
        return "bienvienido al servicio facturacion";
    }
}
