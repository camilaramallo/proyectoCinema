package com.example.springservirestcine.controller;

import com.example.springservirestcine.repository.PeliculaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PeliculaController {

    private PeliculaRepository peliculaRepository;

    public PeliculaController(PeliculaRepository peliculaRepository) {
        this.peliculaRepository = peliculaRepository;
    }
}
