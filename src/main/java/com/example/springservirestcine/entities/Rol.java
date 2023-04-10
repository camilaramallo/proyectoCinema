package com.example.springservirestcine.entities;

import javax.persistence.Entity;

@Entity
public class Rol {
    private String nombre;

    public Rol() {
    }

    public Rol(String nombre) {
        this.nombre = nombre;
    }

    // A continuación se listan todos los métodos
    // de seteo de cada atributo de la clase

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Rol" + nombre;
    }
}
