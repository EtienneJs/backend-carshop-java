package com.etiennebackend.cartapp.backcartapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.etiennebackend.cartapp.backcartapp.models.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
    
}
