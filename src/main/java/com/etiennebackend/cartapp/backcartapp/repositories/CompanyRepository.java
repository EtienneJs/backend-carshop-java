package com.etiennebackend.cartapp.backcartapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.etiennebackend.cartapp.backcartapp.models.entities.Company;

public interface CompanyRepository extends CrudRepository<Company,Long> {
    
}
