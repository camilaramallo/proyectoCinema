package com.example.springservirestcine.entities;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
public class Funcion {
    private int diaSemana;
    private int duracion;
    private Date horaInicio;
    private int numero;
    private Pelicula pelicula;
    private Sala sala;
    private List<Entrada> entradas;


    public Funcion() {
        entradas = new ArrayList<Entrada>();
    }

    public Funcion(int diaSemana, int duracion, Date horaInicio, int numero, Pelicula pelicula, Sala sala) {
        this.diaSemana = diaSemana;
        this.duracion = duracion;
        this.horaInicio = horaInicio;
        this.numero = numero;
        this.pelicula = pelicula;
        this.sala = sala;
    }

    public int getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(int diaSemana) {
        this.diaSemana = diaSemana;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public List<Entrada> getEntradas() {
        return entradas;
    }

    public void setEntradas(List<Entrada> entradas) {
        this.entradas = entradas;
    }

    @Override
    public String toString() {
        return "Funcion: " +
                "diaSemana=" + diaSemana +
                ", duracion=" + duracion +
                ", horaInicio=" + horaInicio +
                ", numero=" + numero +
                ", pelicula=" + pelicula +
                ", sala=" + sala +
                ", entradas=" + entradas;
    }
}
