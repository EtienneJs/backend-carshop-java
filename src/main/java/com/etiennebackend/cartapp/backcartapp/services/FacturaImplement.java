package com.etiennebackend.cartapp.backcartapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.etiennebackend.cartapp.backcartapp.models.entities.Factura;
import com.etiennebackend.cartapp.backcartapp.repositories.FacturaRepository;

@Service
public class FacturaImplement implements FacturaService {
    @Autowired
    private FacturaRepository repository;
    @Override
    @Transactional
    public List<Factura> findAll() {
        return (List<Factura>)repository.findAll();
    }
}
