package com.gamestore.gamestore.services;

import com.gamestore.gamestore.models.Cliente;

import java.util.List;
import java.util.Optional;

public interface ClienteService {
    public Optional<Cliente> traerClientePorDocumento(String documento);
}
