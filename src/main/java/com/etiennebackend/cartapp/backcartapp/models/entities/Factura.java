package com.etiennebackend.cartapp.backcartapp.models.entities;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long total;
    private Long totalItems;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "client_Id", referencedColumnName = "id")
    private Client client;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "company_Id", referencedColumnName = "id")
    private Company company;

    @OneToMany(mappedBy = "factura")
    private Set<FacturaProducto> facturaProductos;

    public Factura(){

    }

    public Long getTotal() {
        return total;
    }
    public void setTotal(Long total) {
        this.total = total;
    }
    public Long getTotalItems() {
        return totalItems;
    }
    public void setTotalItems(Long totalItems) {
        this.totalItems = totalItems;
    }
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
    public void setClient(Client client){
        this.client = client;
    }
    public Client getClient(){
        return client;
    }
    public void setCompany(Company company){
        this.company = company;
    }
    public Company getCompany(){
        return company;
    }    


}
