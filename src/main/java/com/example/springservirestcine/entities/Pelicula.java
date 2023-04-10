package com.example.springservirestcine.entities;


import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

@Entity
public class Pelicula {
    //atributos encapsulados
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("Clave ficticia autoincremental Tipo Long")
    private Long id;
    private int anioEstreno;
    private boolean disponible;
    private int duracion;
    private Date fechaIngreso;
    private String nombre;
    private String tituloOriginal;
    private PaisDeOrigen paisDeOrigen;
    private List<Personaje> personajes;
    private List<Funcion> funciones;
    private Genero genero;
    private Calificacion calificacion;

    //constructores
    public Pelicula() {
    }

    public Pelicula(Long id, int anioEstreno, boolean disponible, int duracion, Date fechaIngreso, String nombre,
                    String tituloOriginal, PaisDeOrigen paisDeOrigen, List<Personaje> personajes,
                    List<Funcion> funciones, Genero genero, Calificacion calificacion) {
        this.id = id;
        this.anioEstreno = anioEstreno;
        this.disponible = disponible;
        this.duracion = duracion;
        this.fechaIngreso = fechaIngreso;
        this.nombre = nombre;
        this.tituloOriginal = tituloOriginal;
        this.paisDeOrigen = paisDeOrigen;
        this.personajes = personajes;
        this.funciones = funciones;
        this.genero = genero;
        this.calificacion = calificacion;
    }

    //preguntamos si esta disponible
    public boolean estaDisponible() {
        return disponible;
    }

    // setter y getter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAnioEstreno() {
        return anioEstreno;
    }

    public void setAnioEstreno(int anioEstreno) {
        this.anioEstreno = anioEstreno;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTituloOriginal() {
        return tituloOriginal;
    }

    public void setTituloOriginal(String tituloOriginal) {
        this.tituloOriginal = tituloOriginal;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public PaisDeOrigen getPaisDeOrigen() {
        return paisDeOrigen;
    }

    public void setPaisDeOrigen(PaisDeOrigen paisDeOrigen) {
        this.paisDeOrigen = paisDeOrigen;
    }

    public List<Personaje> getPersonajes() {
        return personajes;
    }

    public void setPersonajes(List<Personaje> personajes) {
        this.personajes = personajes;
    }

    public List<Funcion> getFunciones() {
        return funciones;
    }

    public void setFunciones(List<Funcion> funciones) {
        this.funciones = funciones;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Calificacion getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Calificacion calificacion) {
        this.calificacion = calificacion;
    }

    //toString

    @Override
    public String toString() {
        return "Pelicula" +
                "id=" + id +
                ", anioEstreno=" + anioEstreno +
                ", disponible=" + disponible +
                ", duracion=" + duracion +
                ", fechaIngreso=" + fechaIngreso +
                ", nombre='" + nombre + '\'' +
                ", tituloOriginal='" + tituloOriginal + '\'' +
                ", paisDeOrigen=" + paisDeOrigen +
                ", personajes=" + personajes +
                ", funciones=" + funciones +
                ", genero=" + genero +
                ", calificacion=" + calificacion;
    }
}
