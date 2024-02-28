package com.solredes.sports.Solredessports.model;

import javax.persistence.*;

@Entity
@Table (name = "torneodeporte")
public class TorneoDeporte {
    @Id
    private int idtorneodeporte;

    @ManyToOne
    @JoinColumn(name="idtorneo")
    private Torneo torneo;
    @ManyToOne
    @JoinColumn(name="iddeporte")
    private Deporte deporte;

    public TorneoDeporte(int idtorneodeporte, Torneo torneo, Deporte deporte) {
        this.idtorneodeporte = idtorneodeporte;
        this.torneo = torneo;
        this.deporte = deporte;
    }

    public TorneoDeporte() {

    }

    public int getIdTorneoDeporte() {
        return idtorneodeporte;
    }

    public void setIdTorneoDeporte(int idtorneodeporte) {
        this.idtorneodeporte = idtorneodeporte;
    }

    public Torneo getTorneo() {
        return torneo;
    }

    public void setTorneo(Torneo torneo) {
        this.torneo = torneo;
    }

    public Deporte getDeporte() {
        return deporte;
    }

    public void setDeporte(Deporte deporte) {
        this.deporte = deporte;
    }
}
