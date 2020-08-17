package com.gamestore.gamestore.repositories;

import com.gamestore.gamestore.models.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class ClienteRepositoryImp {

    @Autowired(required = true)
    private ClienteRepository repository;

    public Optional<Cliente> traerClientePorDocumento(String documento) {
        return repository.findByDocumento(documento);
    }
}
