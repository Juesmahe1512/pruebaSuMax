package com.gamestore.gamestore.services;

import com.gamestore.gamestore.models.Juego;
import com.gamestore.gamestore.repositories.JuegoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JuegoServiceImpl implements JuegoService {

    @Autowired
    JuegoRepository juegoRepository;


    @Override
    public List<Juego> consultarJuegosPorDirector(String director) {
        return juegoRepository.findByDirector(director);
    }

    @Override
    public List<Juego> consultarJuegoPorProductor(String productor) {
        return juegoRepository.findByProductor(productor);
    }

    @Override
    public List<Juego> consultarJuegoPorMarca(String marca) {
        return juegoRepository.findByMarca(marca);
    }
}
