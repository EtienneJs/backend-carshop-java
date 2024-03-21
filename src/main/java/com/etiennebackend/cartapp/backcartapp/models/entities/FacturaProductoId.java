package com.etiennebackend.cartapp.backcartapp.models.entities;

import java.io.Serializable;

@jakarta.persistence.Embeddable
public class FacturaProductoId implements Serializable {
    private Long facturaId;
    private Long productoId;

    // Constructores, getters y setters
}