package com.etiennebackend.cartapp.backcartapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.etiennebackend.cartapp.backcartapp.models.entities.Andress;
import com.etiennebackend.cartapp.backcartapp.repositories.AndressRepository;
@Service
public class AndressImplements implements AndressService  {
    @Autowired
    private AndressRepository repository;

    @Override
    @Transactional
    public List<Andress> findAll() {
        return (List<Andress>)repository.findAll();
    }

    @Override
    @Transactional
    public Andress insertOneProduct(Andress andress){
        Andress newAndress = new Andress();
        // String city, String country,Long number,String street
        newAndress.setColums(andress.getCity(),andress.getCountry(),andress.getNumber(),andress.getStreet());
        repository.save(newAndress);
        return newAndress; 
    }
}
