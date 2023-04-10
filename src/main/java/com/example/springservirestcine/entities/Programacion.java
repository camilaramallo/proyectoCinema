package com.example.springservirestcine.entities;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
public class Programacion {

    private Date fechaInicio;
    private Date fechaFin;
    private Date fechaHoraCreada;
    private List<Funcion> funciones;


    public Programacion() {
        funciones = new ArrayList<>();
    }

    public Programacion(Date fechaInicio, Date fechaFin, Date fechaHoraCreada, List<Funcion> funciones) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.fechaHoraCreada = fechaHoraCreada;
        this.funciones = funciones;
        this.funciones = new ArrayList<>();
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Date getFechaHoraCreada() {
        return fechaHoraCreada;
    }

    public void setFechaHoraCreada(Date fechaHoraCreada) {
        this.fechaHoraCreada = fechaHoraCreada;
    }

    public List<Funcion> getFunciones() {
        return funciones;
    }

    public void setFunciones(List<Funcion> funciones) {
        this.funciones = funciones;
    }

    @Override
    public String toString() {
        return "Programacion: " +
                "fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", fechaHoraCreada=" + fechaHoraCreada +
                ", funciones=" + funciones;
    }
}
