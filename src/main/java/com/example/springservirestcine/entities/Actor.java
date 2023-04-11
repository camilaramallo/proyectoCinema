package com.example.springservirestcine.entities;

import javax.persistence.Entity;

//@Entity
public class Actor {
    private Integer id;
    private boolean animado;
    private String apellido;
    private String nombre;
    private Sexo sexo;

    public Actor() {
    }

    public boolean isAnimado() {
        return animado;
    }

    public void setAnimado(boolean animado) {
        this.animado = animado;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido;
    }
}
