package com.gamestore.gamestore.services;

import com.gamestore.gamestore.models.Juego;

import java.util.List;

public interface JuegoService {
    public List<Juego> consultarJuegosPorDirector(String director);

    List<Juego> consultarJuegoPorProductor(String productor);

    List<Juego> consultarJuegoPorMarca(String marca);
}
