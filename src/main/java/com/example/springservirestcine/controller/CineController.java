package com.example.springservirestcine.controller;


import com.example.springservirestcine.repository.CineRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CineController {

    //private CineRepository cineRepository;

    public CineController(/*CineRepository cineRepository*/) {
        //this.cineRepository = cineRepository;
    }
}
