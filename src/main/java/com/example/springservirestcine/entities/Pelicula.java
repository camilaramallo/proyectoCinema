package com.example.springservirestcine.entities;


import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pelicula {
    //atributos encapsulados
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("Clave ficticia autoincremental Tipo Long")
    private Long id;
    private int anioEstreno;
    private boolean disponible;
    private int duracion;
    //private Date fechaIngreso;
    private String nombre;
    private String tituloOriginal;
    //private PaisDeOrigen paisDeOrigen;
    //private List<Personaje> personajes;
    //private List<Funcion> funciones;
    //private Genero genero;
    //private Calificacion calificacion;

    @Override
    public String toString() {
        return "Pelicula" +
                "id=" + id +
                ", anioEstreno=" + anioEstreno +
                ", disponible=" + disponible +
                ", duracion=" + duracion +
                //", fechaIngreso=" + fechaIngreso +
                ", nombre='" + nombre + '\'' +
                ", tituloOriginal='" + tituloOriginal + '\''/* +
                ", paisDeOrigen=" + paisDeOrigen +
                ", personajes=" + personajes +
                ", funciones=" + funciones +
                ", genero=" + genero +
                ", calificacion=" + calificacion*/;
    }
}
