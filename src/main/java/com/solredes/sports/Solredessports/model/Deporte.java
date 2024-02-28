package com.solredes.sports.Solredessports.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "deporte")
public class Deporte {
    @Id
    private Long iddeporte;
    private String nombre;

    public Deporte(Long idDeporte, String Nombre) {
        iddeporte = idDeporte;
        nombre = Nombre;
    }

    public Deporte() {

    }

    public Long getIdDeporte() {
        return iddeporte;
    }

    public void setIdDeporte(Long idDeporte) {
        iddeporte = idDeporte;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        nombre = nombre;
    }
}
