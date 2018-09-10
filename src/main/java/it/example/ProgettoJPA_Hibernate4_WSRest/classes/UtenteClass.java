package it.example.ProgettoJPA_Hibernate4_WSRest.classes;

import java.util.List;

public class UtenteClass {

	private static final long serialVersionUID = 1L;
	private String nome;
	private String cognome;
	private String email;
	private CredenzialiClass cred;
	private ProfiloClass profilo;
	private List<TelefonoClass> telList;

	public UtenteClass() {
	}

	public UtenteClass(int idUtente, String nome, String cognome, String email, CredenzialiClass cred,
			ProfiloClass profilo, List<TelefonoClass> telList) {
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.cred = cred;
		this.profilo = profilo;
		this.telList = telList;
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

	public CredenzialiClass getCred() {
		return cred;
	}

	public void setCred(CredenzialiClass cred) {
		this.cred = cred;
	}

	public ProfiloClass getProfilo() {
		return profilo;
	}

	public void setProfilo(ProfiloClass profilo) {
		this.profilo = profilo;
	}

	public List getTelList() {
		return telList;
	}

	public void setTelList(List telList) {
		this.telList = telList;
	}
}
