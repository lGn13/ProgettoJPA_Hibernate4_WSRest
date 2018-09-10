package it.example.ProgettoJPA_Hibernate4_WSRest.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.*;

@Entity
@Table(name = "PROFILO")
public class Profilo implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="ID_PROFILO")
	@GeneratedValue
	private int idProfilo;
	private String ruolo;
	private int salario;
	@OneToMany(mappedBy="profilo")
	private Collection<Utente> user = new ArrayList<Utente>();
	
	public int getIdProfilo() {
		return idProfilo;
	}
	public void setIdProfilo(int idProfilo) {
		this.idProfilo = idProfilo;
	}
	public String getRuolo() {
		return ruolo;
	}
	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	public Collection<Utente> getUser() {
		return user;
	}
	public void setUser(Collection<Utente> user) {
		this.user = user;
	}
	
	
}
