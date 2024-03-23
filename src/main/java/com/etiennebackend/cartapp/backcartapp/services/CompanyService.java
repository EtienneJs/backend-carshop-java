package com.etiennebackend.cartapp.backcartapp.services;

import java.util.List;

import com.etiennebackend.cartapp.backcartapp.models.entities.Company;

public interface CompanyService {
    List<Company> findAll();
    Company insertOneProduct(Company company);
}
