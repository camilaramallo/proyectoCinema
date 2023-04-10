package com.example.springservirestcine.entities;


import javax.persistence.Entity;

@Entity
public class Personaje {
    private String nombreEnPelicula;
    private Actor actor;
    private Rol rol;


    public Personaje() {
    }

    public Personaje(String nombreEnPelicula, Actor personaje, Rol rol) {
        this.nombreEnPelicula = nombreEnPelicula;
        this.actor = personaje;
        this.rol = rol;
    }


    public String getNombreEnPelicula() {
        return nombreEnPelicula;
    }

    public void setNombreEnPelicula(String nombreEnPelicula) {
        this.nombreEnPelicula = nombreEnPelicula;
    }

    public Actor getPersonaje() {
        return actor;
    }

    public void setPersonaje(Actor personaje) {
        this.actor = personaje;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return nombreEnPelicula + " interpretado por " + actor;
    }
}
