package com.gamestore.gamestore.controllers;

import com.gamestore.gamestore.models.Juego;
import com.gamestore.gamestore.services.JuegoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/juego")
public class JuegoController {

    @Autowired
    JuegoService juegoService;

    @GetMapping("/director/{director}")
    public ResponseEntity<?> traerJuegosPorDirector(@PathVariable("director") String director){
        if(director.equals("")||director==null){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok().body(juegoService.consultarJuegosPorDirector(director));
    }

    @GetMapping("/marca/{marca}")
    public ResponseEntity<?> traerJuegosPorMarca(@PathVariable("marca") String marca){
        if(marca.equals("")||marca==null){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok().body(juegoService.consultarJuegoPorMarca(marca));
    }

    @GetMapping("/productor/{productor}")
    public ResponseEntity<?> traerJuegosPorProductor(@PathVariable("productor") String productor){
        if(productor.equals("")||productor==null){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok().body(juegoService.consultarJuegoPorProductor(productor));
    }
}
