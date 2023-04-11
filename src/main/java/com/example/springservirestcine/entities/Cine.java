package com.example.springservirestcine.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


//@Entity
public class Cine {

    private String direccion;
    private Date fechaInauguracion;
    private String nombre;
    private List<Sala> salas;
    private List<HorarioFuncion> horariosFunciones;
    private List<Programacion> programaciones;
    private BigDecimal precioEntrada;

    public Cine() {
        salas = new ArrayList<>();
        horariosFunciones = new ArrayList<>();
        programaciones = new ArrayList<>();
    }

    public Cine(String direccion, Date fechaInauguracion, String nombre, List<Sala> salas,
                List<HorarioFuncion> horariosFunciones, List<Programacion> programaciones, BigDecimal precioEntrada) {
        this.direccion = direccion;
        this.fechaInauguracion = fechaInauguracion;
        this.nombre = nombre;
        this.salas = salas;
        this.horariosFunciones = horariosFunciones;
        this.programaciones = programaciones;
        this.precioEntrada = precioEntrada;
    }
}
