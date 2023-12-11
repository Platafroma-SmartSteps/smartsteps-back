package com.example.smartstepsback.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "estudantes_grupos")
public class EstudanteGrupo {
    @Id
    @Column(name = "id_estudantes_grupos")
    private int idEstudanteGrupo;

    @Column(name = "id_estudantes")
    private int idEstudante;

    @Column(name = "id_grupos")
    private int idGrupo;

    public int getIdEstudanteGrupo() {
        return idEstudanteGrupo;
    }

    public void setIdEstudanteGrupo(int idEstudanteGrupo) {
        this.idEstudanteGrupo = idEstudanteGrupo;
    }

    public int getIdEstudante() {
        return idEstudante;
    }

    public void setIdEstudante(int idEstudante) {
        this.idEstudante = idEstudante;
    }

    public int getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(int idGrupo) {
        this.idGrupo = idGrupo;
    }
}
