package com.gamestore.gamestore.services;

import com.gamestore.gamestore.models.Cliente;
import com.gamestore.gamestore.repositories.ClienteRepository;
import com.gamestore.gamestore.repositories.ClienteRepositoryImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService{
    @Autowired
    ClienteRepositoryImp clienteRepository;

    @Override
    public Optional<Cliente> traerClientePorDocumento(String documento) {
        return clienteRepository.traerClientePorDocumento(documento);
    }
}
