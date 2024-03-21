package com.etiennebackend.cartapp.backcartapp.services;
import java.util.List;

import com.etiennebackend.cartapp.backcartapp.models.entities.Product;

public interface ProductService {
    List<Product> findAll();
    Product findById(Long id);
    Boolean save(Long id, Product product);
}
