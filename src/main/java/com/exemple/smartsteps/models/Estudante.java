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
public class Estudante{

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEstudante;

    @Column(name = "nome")
    private String nomeEstudante;

    @Column(name = "sobrenome")
    private String sobrenomeEstudante;

    @Column(name = "cpf")
    private String cpfEstudante;

    @Column(name = "data_nascimento")
    private Date nascimentoEstudante;

    @Column(name = "email")
    private String emailEstudante;

    @Column(name = "senha")
    private String senhaEstudante;

    @Column(name = "endereco")
    private String enderecoEstudante;

    @Column(name = "cidade")
    private String cidadeEstudante;

    @Column(name = "estado")
    private String estadoEstudante;

    @ManyToOne
    @JoinColumn(name = "status")
    private Status statusEstudante;

	public Estudante() {
	}

	public Estudante(Long idEstudante, String nomeEstudante, String sobrenomeEstudante, String cpfEstudante,
			Date nascimentoEstudante, String emailEstudante, String senhaEstudante, String enderecoEstudante,
			String cidadeEstudante, String estadoEstudante, Status statusEstudante) {
		this.idEstudante = idEstudante;
		this.nomeEstudante = nomeEstudante;
		this.sobrenomeEstudante = sobrenomeEstudante;
		this.cpfEstudante = cpfEstudante;
		this.nascimentoEstudante = nascimentoEstudante;
		this.emailEstudante = emailEstudante;
		this.senhaEstudante = senhaEstudante;
		this.enderecoEstudante = enderecoEstudante;
		this.cidadeEstudante = cidadeEstudante;
		this.estadoEstudante = estadoEstudante;
		this.statusEstudante = statusEstudante;
	}

	public Long getIdEstudante() {
		return idEstudante;
	}

	public void setIdEstudante(Long idEstudante) {
		this.idEstudante = idEstudante;
	}

	public String getNomeEstudante() {
		return nomeEstudante;
	}

	public void setNomeEstudante(String nomeEstudante) {
		this.nomeEstudante = nomeEstudante;
	}

	public String getSobrenomeEstudante() {
		return sobrenomeEstudante;
	}

	public void setSobrenomeEstudante(String sobrenomeEstudante) {
		this.sobrenomeEstudante = sobrenomeEstudante;
	}

	public String getCpfEstudante() {
		return cpfEstudante;
	}

	public void setCpfEstudante(String cpfEstudante) {
		this.cpfEstudante = cpfEstudante;
	}

	public Date getNascimentoEstudante() {
		return nascimentoEstudante;
	}

	public void setNascimentoEstudante(Date nascimentoEstudante) {
		this.nascimentoEstudante = nascimentoEstudante;
	}

	public String getEmailEstudante() {
		return emailEstudante;
	}

	public void setEmailEstudante(String emailEstudante) {
		this.emailEstudante = emailEstudante;
	}

	public String getSenhaEstudante() {
		return senhaEstudante;
	}

	public void setSenhaEstudante(String senhaEstudante) {
		this.senhaEstudante = senhaEstudante;
	}

	public String getEnderecoEstudante() {
		return enderecoEstudante;
	}

	public void setEnderecoEstudante(String enderecoEstudante) {
		this.enderecoEstudante = enderecoEstudante;
	}

	public String getCidadeEstudante() {
		return cidadeEstudante;
	}

	public void setCidadeEstudante(String cidadeEstudante) {
		this.cidadeEstudante = cidadeEstudante;
	}

	public String getEstadoEstudante() {
		return estadoEstudante;
	}

	public void setEstadoEstudante(String estadoEstudante) {
		this.estadoEstudante = estadoEstudante;
	}

	public Status getStatusEstudante() {
		return statusEstudante;
	}

	public void setStatusEstudante(Status statusEstudante) {
		this.statusEstudante = statusEstudante;
	}

}

