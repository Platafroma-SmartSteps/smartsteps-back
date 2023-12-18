package com.exemple.smartsteps.models;

import jakarta.persistence.*;

@Entity
public class EstudanteVisita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estudantes_visita_culturais")
    private int idVisitaEstudante;

    @ManyToOne
    @JoinColumn(name = "id_estudantes")
    private Estudante idEstudante;

    @ManyToOne
    @JoinColumn(name = "id_visita_culturais")
    private Visita idVisita;

    public int getIdVisitaEstudante() {
        return idVisitaEstudante;
    }

    public void setIdVisitaEstudante(int idVisitaEstudante) {
        this.idVisitaEstudante = idVisitaEstudante;
    }

    public Estudante getIdEstudante() {
        return idEstudante;
    }

    public void setIdEstudante(Estudante idEstudante) {
        this.idEstudante = idEstudante;
    }

    public Visita getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(Visita idVisita) {
        this.idVisita = idVisita;
    }
}
