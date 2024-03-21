package com.etiennebackend.cartapp.backcartapp.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.etiennebackend.cartapp.backcartapp.models.entities.Product;
import com.etiennebackend.cartapp.backcartapp.repositories.ProductRepository;

import jakarta.persistence.EntityNotFoundException;
@Service
public class ProductServiceImplement implements ProductService {
    @Autowired
    private ProductRepository repository;
    @Override
    @Transactional
    public List<Product> findAll() {
        return (List<Product>)repository.findAll();
    }
    @SuppressWarnings("null")
    @Override
    @Transactional
    public Product findById(Long id) {
        return repository.findById(id).orElse(null);
    }
    @SuppressWarnings("null")
    @Override
    @Transactional
    public Boolean save(Long id, Product product) {
        Product existingProduct = repository.findById(id).orElseThrow(()-> new EntityNotFoundException("Producto no Encontrado"));
        existingProduct.setName(product.getName());
        existingProduct.setDescription(product.getDescription());
        existingProduct.setPrice(product.getPrice());
        repository.save(existingProduct);
        return true;
    }
    
}
