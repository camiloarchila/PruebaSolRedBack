package com.solredes.sports.Solredessports.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "torneo")
public class Torneo {
    @Id
    private Long idtorneo;
    private String nombre;
    private Date Fecha;

    public Torneo(Long idTorneo, String Nombre, Date fecha) {
        idtorneo = idTorneo;
        nombre = Nombre;
        Fecha = fecha;
    }

    public Torneo() {

    }

    public Long getIdTorneo() {
        return idtorneo;
    }

    public void setIdTorneo(Long idTorneo) {
        idtorneo = idTorneo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        nombre = Nombre;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date fecha) {
        Fecha = fecha;
    }
}
