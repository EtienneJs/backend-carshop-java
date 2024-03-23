package com.etiennebackend.cartapp.backcartapp.services;

import java.util.List;

import com.etiennebackend.cartapp.backcartapp.models.entities.Andress;

public interface AndressService {
    List<Andress> findAll();
    Andress insertOneProduct(Andress andress);
}
