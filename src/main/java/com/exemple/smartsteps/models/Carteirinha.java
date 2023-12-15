package com.exemple.smartsteps.models;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class Carteirinha {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCarterinha;

    @Column(name = "cpf",length=120,nullable=false)
    private String cpfCarterinha;

    @Column(name = "nome_instituicao",length=12,nullable=false)
    private String nomeInstituicao;

    @Column(name = "data_emissao", nullable=true)
    private Date dataEmissao;

    @Column(name = "certificado_de_faculdade",length=50,nullable=false)
    private String certificadoFaculdade;

    @ManyToOne
    @JoinColumn(name="Status")
    private Status statusCarteirinha;

    public Carteirinha() {}

	public Carteirinha(Long idCarterinha, String cpfCarterinha, String nomeInstituicao, Date dataEmissao,
			String certificadoFaculdade, Status statusCarteirinha) {
		this.idCarterinha = idCarterinha;
		this.cpfCarterinha = cpfCarterinha;
		this.nomeInstituicao = nomeInstituicao;
		this.dataEmissao = dataEmissao;
		this.certificadoFaculdade = certificadoFaculdade;
		this.statusCarteirinha = statusCarteirinha;
	}

	public Long getIdCarterinha() {
		return idCarterinha;
	}

	public void setIdCarterinha(Long idCarterinha) {
		this.idCarterinha = idCarterinha;
	}

	public String getCpfCarterinha() {
		return cpfCarterinha;
	}

	public void setCpfCarterinha(String cpfCarterinha) {
		this.cpfCarterinha = cpfCarterinha;
	}

	public String getNomeInstituicao() {
		return nomeInstituicao;
	}

	public void setNomeInstituicao(String nomeInstituicao) {
		this.nomeInstituicao = nomeInstituicao;
	}

	public Date getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public String getCertificadoFaculdade() {
		return certificadoFaculdade;
	}

	public void setCertificadoFaculdade(String certificadoFaculdade) {
		this.certificadoFaculdade = certificadoFaculdade;
	}

	public Status getStatusCarteirinha() {
		return statusCarteirinha;
	}

	public void setStatusCarteirinha(Status statusCarteirinha) {
		this.statusCarteirinha = statusCarteirinha;
	}

    
}
