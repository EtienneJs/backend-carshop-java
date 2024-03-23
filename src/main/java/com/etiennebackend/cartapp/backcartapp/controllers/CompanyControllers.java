package com.etiennebackend.cartapp.backcartapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.etiennebackend.cartapp.backcartapp.models.entities.Company;
import com.etiennebackend.cartapp.backcartapp.services.CompanyService;

@RestController
public class CompanyControllers {
    @Autowired
    private CompanyService service;
    @GetMapping("/company")
     public java.util.List<Company> list(){
        return service.findAll();
    }
}
