package com.gamestore.gamestore.repositories;

import com.gamestore.gamestore.models.Juego;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface JuegoRepository extends JpaRepository<Juego,Long> {

    public List<Juego> findByDirector(String director);

    public List<Juego> findByMarca(String marca);

    public List<Juego> findByProductor(String productor);

    @Query("SELECT J FROM Juego J WHERE J.alquiler.fechaPeticion BETWEEN :fechaInicial AND :fechaFinal ORDER BY J.numeroAlquileres ASC")
    public List<Juego> buscarJuegoMenosAlquilado(@Param("fechaInicial") Date fechaInicial,@Param("fechaFinal") Date fechaFinal);

}
