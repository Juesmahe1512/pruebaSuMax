package com.gamestore.gamestore.controllers;

import com.gamestore.gamestore.models.Cliente;
import com.gamestore.gamestore.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    ClienteService clienteService;


    @GetMapping("/documento/{documento}")
    public ResponseEntity<?> traerJuegosPorDirector(@PathVariable("documento") String documento){
        Optional<Cliente> clienteOptional= clienteService.traerClientePorDocumento(documento);
        if(documento.equals("")||documento==null||!clienteOptional.isPresent()){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok().body(clienteOptional.get());
    }

}
