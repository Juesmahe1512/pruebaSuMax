package com.gamestore.gamestore.models;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="alquiler")
public class Alquiler {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int precio;
    private boolean estado;
    private Date periodoAlquiler;
    private Date fechaPeticion;
    private Date fechaEntrega;

    @OneToOne
    @JoinColumn(name = "fk_cliente")
    private Cliente cliente;

    @OneToMany(mappedBy="juego")
    private List<Juego> juego;



    @Column(name = "create_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt;

    public Alquiler() {
    }

    public int getPrecio() {
        return precio;
    }


    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Date getPeriodoAlquiler() {
        return periodoAlquiler;
    }

    public void setPeriodoAlquiler(Date periodoAlquiler) {
        this.periodoAlquiler = periodoAlquiler;
    }

    public Date getFechaPeticion() {
        return fechaPeticion;
    }

    public void setFechaPeticion(Date fechaPeticion) {
        this.fechaPeticion = fechaPeticion;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
}
