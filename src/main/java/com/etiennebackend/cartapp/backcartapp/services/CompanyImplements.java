package com.etiennebackend.cartapp.backcartapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.etiennebackend.cartapp.backcartapp.models.entities.Company;
import com.etiennebackend.cartapp.backcartapp.repositories.CompanyRepository;
@Service
public class CompanyImplements implements CompanyService {
    @Autowired
    private CompanyRepository repository;

    @Override
    @Transactional
    public List<Company> findAll() {
        return (List<Company>)repository.findAll();
    }

    @Override
    @Transactional
    public Company insertOneProduct(Company company){
        Company newCompany = new Company();
        newCompany.setColums(company.getName(),company.getFiscalNumber());
        repository.save(newCompany);
        return newCompany; 
    }
    
}
