package it.example.ProgettoJPA_Hibernate4_WSRest.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.*;

@Entity
@Table(name = "CREDENZIALI")
public class Credenziali {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="ID_CRED")
	@GeneratedValue
	private int idCred;
	private String username;
	private String password;
	
	public int getIdCred() {
		return idCred;
	}
	public void setIdCred(int idCred) {
		this.idCred = idCred;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
	
}
