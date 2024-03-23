package com.etiennebackend.cartapp.backcartapp.models.entities;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String fiscalNumber;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getFiscalNumber() {
        return fiscalNumber;
    }
    public void setFiscalNumber(String fiscalNumber) {
        this.fiscalNumber = fiscalNumber;
    }
    public void setColums (String name, String fiscalNumber){
        setFiscalNumber(fiscalNumber);
        setName(name);
    }
    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL)
	private Set<Factura> factura;
}
