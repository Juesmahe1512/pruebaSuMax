package com.gamestore.gamestore.repositories;

import com.gamestore.gamestore.models.Juego;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JuegoRepositoryImp {
    @Autowired(required = true)
    private JuegoRepository repository;

    public List<Juego> traerJuegosPorDirector(String director){
        return repository.findByDirector(director);
    }

    public List<Juego> consultarProductor(String productor){
        return repository.findByProductor(productor);
    }

    public List<Juego> consultarMarca(String marca){
        return repository.findByMarca(marca);
    }

}
