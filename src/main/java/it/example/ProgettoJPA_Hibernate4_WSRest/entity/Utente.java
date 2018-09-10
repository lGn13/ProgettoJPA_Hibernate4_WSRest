package it.example.ProgettoJPA_Hibernate4_WSRest.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "UTENTE")
public class Utente implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="ID_UTENTE")
	@GeneratedValue
	private int idUtente;
	private String nome;
	private String cognome;
	private String email;
	@OneToOne
    @JoinColumn(name = "ID_CRED")
	private Credenziali cred;
	@ManyToOne
	@JoinColumn(name="ID_PROFILO")
	private Profilo profilo;
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "TELEFONI_UTENTI", 
    			joinColumns = @JoinColumn(name = "ID_UTENTE"),
    			inverseJoinColumns = @JoinColumn(name = "ID_TELEFONO"))
	private List<Telefono> telList = new ArrayList();
	
	
	public int getIdUtente() {
		return idUtente;
	}
	public void setIdUtente(int idUtente) {
		this.idUtente = idUtente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Profilo getProfilo() {
		return profilo;
	}
	public void setProfilo(Profilo profilo) {
		this.profilo = profilo;
	}
	public List<Telefono> getTelList() {
		return telList;
	}
	public void setTelList(List<Telefono> telList) {
		this.telList = telList;
	}
	public Credenziali getCred() {
		return cred;
	}
	public void setCred(Credenziali cred) {
		this.cred = cred;
	}
	

}
