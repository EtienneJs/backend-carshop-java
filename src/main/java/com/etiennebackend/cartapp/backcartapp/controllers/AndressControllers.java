package com.etiennebackend.cartapp.backcartapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.etiennebackend.cartapp.backcartapp.models.entities.Andress;
import com.etiennebackend.cartapp.backcartapp.services.AndressService;

@RestController
public class AndressControllers {
    @Autowired
    private AndressService service;
    
    @GetMapping("/andress")
     public java.util.List<Andress> list(){
        return service.findAll();
    }
}
