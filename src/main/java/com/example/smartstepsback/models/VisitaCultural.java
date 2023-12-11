package com.example.smartstepsback.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalTime;

@Entity
@Table(schema = "visita_culturais")
public class VisitaCultural {
    @Id
    @Column(name = "id_visita_culturais")
    private int idVisitaCultural;

    @Column(name = "id_professor")
    private int idProfessor;

    @Column(name = "data_hora")
    private LocalTime dataHora;

    @Column(name = "local")
    private String local;

    @Column(name = "status")
    private Status statusCultural;

    public int getIdVisitaCultural() {
        return idVisitaCultural;
    }

    public void setIdVisitaCultural(int idVisitaCultural) {
        this.idVisitaCultural = idVisitaCultural;
    }

    public int getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }

    public LocalTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Status getStatusCultural() {
        return statusCultural;
    }

    public void setStatusCultural(Status statusCultural) {
        this.statusCultural = statusCultural;
    }
}
