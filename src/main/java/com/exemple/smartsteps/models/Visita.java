package com.exemple.smartsteps.models;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class Visita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idVisita;

    @OneToMany
    @JoinColumn(name = "id_professor")
    private Professor idProfessor;

    @Column(name = "data_hora")
    private Date dataHora;

    @ManyToOne
    @JoinColumn(name = "local")
    private String local;

    @ManyToOne
    @JoinColumn(name = "id_status")
    private Status statusVisita;

    public long getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(long idVisita) {
        this.idVisita = idVisita;
    }

    public Professor getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(Professor idProfessor) {
        this.idProfessor = idProfessor;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Status getStatusVisita() {
        return statusVisita;
    }

    public void setStatusVisita(Status statusVisita) {
        this.statusVisita = statusVisita;
    }
}
