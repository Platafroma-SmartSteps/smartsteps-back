package com.exemple.smartsteps.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class Login {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Lob
	@Column(name = "Password", nullable=false)
	private String password;
	@Column(name = "Login", nullable=false, length = 20)
	private String login;
	@Column(name = "FullName", nullable=false, length = 60)
	private String fullName;
	@Column(name = "Email", nullable=false, length = 50)
	private String email;
	
	public Login() {}
	public Login(Long id, String password, String login, String fullName, String email) {
		this.id = id;
		this.password = password;
		this.login = login;
		this.fullName = fullName;
		this.email = email;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
