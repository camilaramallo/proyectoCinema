package com.example.springservirestcine;

import com.example.springservirestcine.repository.CineRepository;
import com.example.springservirestcine.repository.PeliculaRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringServirestCineApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(SpringServirestCineApplication.class, args);
		CineRepository reposCine = context.getBean(CineRepository.class);
		PeliculaRepository reposPelicula = context.getBean(PeliculaRepository.class);
	}

}
