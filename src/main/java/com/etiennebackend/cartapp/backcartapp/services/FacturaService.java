package com.etiennebackend.cartapp.backcartapp.services;

import java.util.List;

import com.etiennebackend.cartapp.backcartapp.models.entities.Factura;

public interface FacturaService {
    List<Factura> findAll();
}
