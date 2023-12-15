package com.exemple.smartsteps.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="status")
public class Status {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_status", nullable = false)
	private int idStatus;

	@Column(name = "nome", nullable = false, length = 36)
	private String nomeStatus;
	
	public Status() {}

	public Status(int idStatus, String nomeStatus) {
		this.idStatus = idStatus;
		this.nomeStatus = nomeStatus;
	}

	public int getIdStatus() {
		return idStatus;
	}

	public void setIdStatus(int idStatus) {
		this.idStatus = idStatus;
	}

	public String getNomeStatus() {
		return nomeStatus;
	}

	public void setNomeStatus(String nomeStatus) {
		this.nomeStatus = nomeStatus;
	}
	
	
}
