package com.etiennebackend.cartapp.backcartapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.etiennebackend.cartapp.backcartapp.models.entities.Product;
import com.etiennebackend.cartapp.backcartapp.services.ProductService;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class ProductControllers {
    @Autowired
    private ProductService service;

    @GetMapping("/products")
    public java.util.List<Product> list(){
        return service.findAll();
    }
    @GetMapping("/products/{id}")
    public Product findOneById(@PathVariable Long id){
        return service.findById(id);
    }
    @PutMapping("/products/{id}")
    public Boolean save(@PathVariable Long id,@RequestBody Product product){
        return service.save(id, product);
    }
    @PostMapping("/products")
    public Product incertOneProduct(@RequestBody Product product) {
        return service.insertOneProduct(product);
    }
    
}
