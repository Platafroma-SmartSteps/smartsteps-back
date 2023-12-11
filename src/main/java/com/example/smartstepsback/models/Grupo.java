package com.example.smartstepsback.models;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(schema = "grupos")
public class Grupo {
    @Id
    @Column(name = "id_grupos")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idGrupo;

    @Column(name = "nome")
    private String nomeGrupo;

    @Column(name = "data_criacao")
    private Date dataCriacao;

    @Column(name = "limite_pessoas")
    private int limitePessoas;

    @Column(name = "materia")
    private String materiaGrupo;

    @Column(name = "status")
    private Status statusGrupo;

    public int getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(int idGrupo) {
        this.idGrupo = idGrupo;
    }

    public String getNomeGrupo() {
        return nomeGrupo;
    }

    public void setNomeGrupo(String nomeGrupo) {
        this.nomeGrupo = nomeGrupo;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public int getLimitePessoas() {
        return limitePessoas;
    }

    public void setLimitePessoas(int limitePessoas) {
        this.limitePessoas = limitePessoas;
    }

    public String getMateriaGrupo() {
        return materiaGrupo;
    }

    public void setMateriaGrupo(String materiaGrupo) {
        this.materiaGrupo = materiaGrupo;
    }

    public Status getStatusGrupo() {
        return statusGrupo;
    }

    public void setStatusGrupo(Status statusGrupo) {
        this.statusGrupo = statusGrupo;
    }
}
