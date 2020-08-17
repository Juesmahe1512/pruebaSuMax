package com.gamestore.gamestore.repositories;

import com.gamestore.gamestore.models.Cliente;
import com.gamestore.gamestore.models.Juego;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {

    public Optional<Cliente> findByDocumento(String documento);




}
