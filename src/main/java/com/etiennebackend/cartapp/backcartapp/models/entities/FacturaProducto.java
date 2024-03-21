package com.etiennebackend.cartapp.backcartapp.models.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Entity
@Table(name = "factura_producto")
public class FacturaProducto {
    @EmbeddedId
    private FacturaProductoId id;

    private Long quantity;

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }
    

    @ManyToOne
    @MapsId("facturaId")
    private Factura factura;

    @ManyToOne
    @MapsId("productoId")
    private Product producto;


    // Getters y setters
}