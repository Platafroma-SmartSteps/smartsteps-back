package com.example.smartstepsback.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "estudantes_visita_culturais")
public class EstudanteVisita {
    @Id
    @Column(name = "id_estudantes_visita_culturais")
    private int idEstudantesVisita;

    @Column(name = "id_estudantes")
    private int idEstudante;

    @Column(name = "id_visita_culturais")
    private int idVisitaCultural;

    public int getIdEstudantesVisita() {
        return idEstudantesVisita;
    }

    public void setIdEstudantesVisita(int idEstudantesVisita) {
        this.idEstudantesVisita = idEstudantesVisita;
    }

    public int getIdEstudante() {
        return idEstudante;
    }

    public void setIdEstudante(int idEstudante) {
        this.idEstudante = idEstudante;
    }

    public int getIdVisitaCultural() {
        return idVisitaCultural;
    }

    public void setIdVisitaCultural(int idVisitaCultural) {
        this.idVisitaCultural = idVisitaCultural;
    }
}
