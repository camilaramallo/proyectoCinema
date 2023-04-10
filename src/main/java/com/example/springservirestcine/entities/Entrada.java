package com.example.springservirestcine.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;


@Entity
public class Entrada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date fechaHoraFuncion;
    private Date fechaHoraVenta;
    private Funcion funcion;
    private BigDecimal precioCobrado;
    private int ticketNro; // Singleton posible


    public Entrada() {
    }

    public Entrada(Long id, Date fechaHoraFuncion, Date fechaHoraVenta, Funcion funcion, BigDecimal precioCobrado,
                   int ticketNro) {
        this.id = id;
        this.fechaHoraFuncion = fechaHoraFuncion;
        this.fechaHoraVenta = fechaHoraVenta;
        this.funcion = funcion;
        this.precioCobrado = precioCobrado;
        this.ticketNro = ticketNro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFechaHoraFuncion() {
        return fechaHoraFuncion;
    }

    public void setFechaHoraFuncion(Date fechaHoraFuncion) {
        this.fechaHoraFuncion = fechaHoraFuncion;
    }

    public Date getFechaHoraVenta() {
        return fechaHoraVenta;
    }

    public void setFechaHoraVenta(Date fechaHoraVenta) {
        this.fechaHoraVenta = fechaHoraVenta;
    }

    public Funcion getFuncion() {
        return funcion;
    }

    public void setFuncion(Funcion funcion) {
        this.funcion = funcion;
    }

    public BigDecimal getPrecioCobrado() {
        return precioCobrado;
    }

    public void setPrecioCobrado(BigDecimal precioCobrado) {
        this.precioCobrado = precioCobrado;
    }

    public int getTicketNro() {
        return ticketNro;
    }

    public void setTicketNro(int ticketNro) {
        this.ticketNro = ticketNro;
    }

    @Override
    public String toString() {
        return "Entrada" +
                "fechaHoraFuncion=" + fechaHoraFuncion +
                ", fechaHoraVenta=" + fechaHoraVenta +
                ", funcion=" + funcion +
                ", precioCobrado=" + precioCobrado +
                ", ticketNro=" + ticketNro;
    }
}
