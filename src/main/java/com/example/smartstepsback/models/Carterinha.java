package com.example.smartstepsback.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.sql.Date;

@Entity
public class Carterinha {
    @Id
    @Column(name = "id_carterinha")
    private String idCarterinha;

    @Column(name = "cpf")
    private String cpfCarterinha;

    @Column(name = "nome_instituicao")
    private String nomeInstituicao;

    @Column(name = "data_emissao")
    private Date dataEmissao;

    @Column(name = "certificado_de_faculdade")
    private String certificadoFaculdade;

    @Column(name = "status")
    private Status statusCarterinha;
}
