package com.example.springservirestcine.entities;


import javax.persistence.Entity;

//@Entity
public class Calificacion {
    private Integer id;
    private String nombre;


    public Calificacion() {
    }

    public Calificacion(String nombre) {
        this.nombre = nombre;
    }

    // A continuación se listan todos los métodos de seteo
    // de cada atributo de la clase

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
}
