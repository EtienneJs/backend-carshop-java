package com.etiennebackend.cartapp.backcartapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.etiennebackend.cartapp.backcartapp.models.entities.Factura;
import com.etiennebackend.cartapp.backcartapp.services.FacturaService;

@RestController
public class FacturaControllers {
    @Autowired
    private FacturaService service;
    @GetMapping("/factura")
     public java.util.List<Factura> list(){
        return service.findAll();
    }
}
