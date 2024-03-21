package com.etiennebackend.cartapp.backcartapp.repositories;
import org.springframework.data.repository.CrudRepository;
import com.etiennebackend.cartapp.backcartapp.models.entities.Factura;

public interface FacturaRepository extends CrudRepository<Factura, Long>{
    
}
