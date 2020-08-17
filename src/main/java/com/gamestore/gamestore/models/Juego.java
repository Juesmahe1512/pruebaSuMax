package com.gamestore.gamestore.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="juegos")
public class Juego {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String marca;
    private String productor;
    private String director;
    private int  numeroAlquileres;
    private String anio;
    private String tecnologia;

    //@OneToMany(mappedBy="protagonista")
    //private List<Protaagonista> protagonistas;


    @Column(name = "create_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt;

    @ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name="alquiler_fk", referencedColumnName="id")
    })
    private Alquiler alquiler;

    public Juego() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProductor() {
        return productor;
    }

    public void setProductor(String productor) {
        this.productor = productor;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }
}
