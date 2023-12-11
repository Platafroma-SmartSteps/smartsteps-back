package com.example.smartstepsback.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.sql.Date;

@Entity
public class Comentario {
    @Id
    @Column(name = "id_comentario")
    private int idComentario;

    @Column(name = "id_aluno")
    private int idAluno;

    @Column(name = "id_professor")
    private int idProfessor;

    @Column(name = "data_comentario")
    private Date dataComentario;

    @Column(name = "comentario_aluno")
    private String comentarioAluno;

    @Column(name = "comentario_professor")
    private String comentarioProfessor;

    public int getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(int idComentario) {
        this.idComentario = idComentario;
    }

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public int getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }

    public Date getDataComentario() {
        return dataComentario;
    }

    public void setDataComentario(Date dataComentario) {
        this.dataComentario = dataComentario;
    }

    public String getComentarioAluno() {
        return comentarioAluno;
    }

    public void setComentarioAluno(String comentarioAluno) {
        this.comentarioAluno = comentarioAluno;
    }

    public String getComentarioProfessor() {
        return comentarioProfessor;
    }

    public void setComentarioProfessor(String comentarioProfessor) {
        this.comentarioProfessor = comentarioProfessor;
    }
}
