package com.example.smartstepsback.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Comunidade {
    @Id
    @Column(name = "id_comunidade")
    private int idComunidade;

    @Column(name = "status")
    private Status statusComunidade;

    @Column(name = "id_grupos")
    private int idGrupos;

    public int getIdComunidade() {
        return idComunidade;
    }

    public void setIdComunidade(int idComunidade) {
        this.idComunidade = idComunidade;
    }

    public Status getStatusComunidade() {
        return statusComunidade;
    }

    public void setStatusComunidade(Status statusComunidade) {
        this.statusComunidade = statusComunidade;
    }

    public int getIdGrupos() {
        return idGrupos;
    }

    public void setIdGrupos(int idGrupos) {
        this.idGrupos = idGrupos;
    }
}
