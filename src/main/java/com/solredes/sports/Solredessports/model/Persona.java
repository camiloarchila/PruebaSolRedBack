package com.solredes.sports.Solredessports.model;

import javax.persistence.*;

@Entity
@Table(name = "persona")
public class Persona {
    @Id
    private Long idpersona;
    private String nombre;

    @OneToOne
    @JoinColumn(name="idtorneodeporte")
    private TorneoDeporte torneodeporte;

    public Persona(Long idpersona, String nombre, TorneoDeporte torneodeporte) {
        idpersona = idpersona;
        nombre = nombre;
        torneodeporte = torneodeporte;
    }

    public Persona() {

    }

    public Long getIdPersona() {
        return idpersona;
    }

    public void setIdPersona(Long idPersona) {
        idpersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        nombre = Nombre;
    }

    public TorneoDeporte getTorneoDeporte() {
        return torneodeporte;
    }

    public void setTorneoDeporte(TorneoDeporte torneoDeporte) {
        this.torneodeporte = torneoDeporte;
    }
}
