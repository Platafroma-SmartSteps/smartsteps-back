package com.example.smartstepsback.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.sql.Date;

@Entity
public class Professor {
    @Id
    @Column(name = "id_professor")
    private int idProfessor;

    @Column(name = "nome")
    private String nomeProfessor;

    @Column(name = "sobrenome")
    private String sobrenomeProfessor;

    @Column(name = "cpf")
    private int cpfProfessor;

    @Column(name = "rg")
    private int rgProfessor;

    @Column(name = "data_nascimento")
    private Date nascimentoProfessor;

    @Column(name = "email")
    private String emailProfessor;

    @Column(name = "senha")
    private String senhaProfessor;

    @Column(name = "endereco")
    private String enderecoProfessor;

    @Column(name = "cidade")
    private String cidadeProfessor;

    @Column(name = "estado")
    private String estadoProfessor;

    @Column(name = "materias_dadas")
    private String materiaDada;

    @Column(name = "status")
    private Status statusProfessor;

    @Column(name = "carterinha_do_professor")
    private String carterinhaProfessor;

    public int getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public String getSobrenomeProfessor() {
        return sobrenomeProfessor;
    }

    public void setSobrenomeProfessor(String sobrenomeProfessor) {
        this.sobrenomeProfessor = sobrenomeProfessor;
    }

    public int getCpfProfessor() {
        return cpfProfessor;
    }

    public void setCpfProfessor(int cpfProfessor) {
        this.cpfProfessor = cpfProfessor;
    }

    public int getRgProfessor() {
        return rgProfessor;
    }

    public void setRgProfessor(int rgProfessor) {
        this.rgProfessor = rgProfessor;
    }

    public Date getNascimentoProfessor() {
        return nascimentoProfessor;
    }

    public void setNascimentoProfessor(Date nascimentoProfessor) {
        this.nascimentoProfessor = nascimentoProfessor;
    }

    public String getEmailProfessor() {
        return emailProfessor;
    }

    public void setEmailProfessor(String emailProfessor) {
        this.emailProfessor = emailProfessor;
    }

    public String getSenhaProfessor() {
        return senhaProfessor;
    }

    public void setSenhaProfessor(String senhaProfessor) {
        this.senhaProfessor = senhaProfessor;
    }

    public String getEnderecoProfessor() {
        return enderecoProfessor;
    }

    public void setEnderecoProfessor(String enderecoProfessor) {
        this.enderecoProfessor = enderecoProfessor;
    }

    public String getCidadeProfessor() {
        return cidadeProfessor;
    }

    public void setCidadeProfessor(String cidadeProfessor) {
        this.cidadeProfessor = cidadeProfessor;
    }

    public String getEstadoProfessor() {
        return estadoProfessor;
    }

    public void setEstadoProfessor(String estadoProfessor) {
        this.estadoProfessor = estadoProfessor;
    }

    public String getMateriaDada() {
        return materiaDada;
    }

    public void setMateriaDada(String materiaDada) {
        this.materiaDada = materiaDada;
    }

    public Status getStatusProfessor() {
        return statusProfessor;
    }

    public void setStatusProfessor(Status statusProfessor) {
        this.statusProfessor = statusProfessor;
    }

    public String getCarterinhaProfessor() {
        return carterinhaProfessor;
    }

    public void setCarterinhaProfessor(String carterinhaProfessor) {
        this.carterinhaProfessor = carterinhaProfessor;
    }
}
