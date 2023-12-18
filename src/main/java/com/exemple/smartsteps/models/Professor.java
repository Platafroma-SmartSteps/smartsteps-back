package com.exemple.smartsteps.models;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_professor")
    private long idProfessor;

    @Column(name = "nome")
    private String nomeProfessor;

    @Column(name = "sobrenome")
    private String sobrenomeProfessor;

    @Column(name = "cpf")
    private String cpfProfessor;

    @Column(name = "rg")
    private String rgProfessor;

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
    
    @ManyToOne
    @JoinColumn(name = "status")
    private Status statusProfessor;

    @ManyToOne
    @JoinColumn(name = "carteirinha")
    private Carteirinha carterinhaProfessor;

    public Professor() {}
    	
	public Professor(Long idProfessor, String nomeProfessor, String sobrenomeProfessor, String cpfProfessor,
			String rgProfessor, Date nascimentoProfessor, String emailProfessor, String senhaProfessor,
			String enderecoProfessor, String cidadeProfessor, String estadoProfessor, String materiaDada,
			Status statusProfessor, Carteirinha carterinhaProfessor) {
		this.idProfessor = idProfessor;
		this.nomeProfessor = nomeProfessor;
		this.sobrenomeProfessor = sobrenomeProfessor;
		this.cpfProfessor = cpfProfessor;
		this.rgProfessor = rgProfessor;
		this.nascimentoProfessor = nascimentoProfessor;
		this.emailProfessor = emailProfessor;
		this.senhaProfessor = senhaProfessor;
		this.enderecoProfessor = enderecoProfessor;
		this.cidadeProfessor = cidadeProfessor;
		this.estadoProfessor = estadoProfessor;
		this.materiaDada = materiaDada;
		this.statusProfessor = statusProfessor;
		this.carterinhaProfessor = carterinhaProfessor;
	}

	public Long getIdProfessor() {
		return idProfessor;
	}

	public void setIdProfessor(Long idProfessor) {
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

	public String getCpfProfessor() {
		return cpfProfessor;
	}

	public void setCpfProfessor(String cpfProfessor) {
		this.cpfProfessor = cpfProfessor;
	}

	public String getRgProfessor() {
		return rgProfessor;
	}

	public void setRgProfessor(String rgProfessor) {
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

	public Carteirinha getCarterinhaProfessor() {
		return carterinhaProfessor;
	}

	public void setCarterinhaProfessor(Carteirinha carterinhaProfessor) {
		this.carterinhaProfessor = carterinhaProfessor;
	}
    
    
}
