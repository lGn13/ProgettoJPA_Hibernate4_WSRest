package it.example.ProgettoJPA_Hibernate4_WSRest.entity;

import java.io.Serializable;
import java.time.Year;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.*;

@Entity
@Table(name = "TELEFONO")
public class Telefono implements Serializable{

	@Id
	@Column(name="ID_TELEFONO")
	@GeneratedValue
	private int idTelefono;
	private String modello;
	private int anno;
	@ManyToMany(mappedBy="telList")
	private Collection<Utente> userList = new ArrayList();
	
	public int getIdTelefono() {
		return idTelefono;
	}

	public void setIdTelefono(int idTelefono) {
		this.idTelefono = idTelefono;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public Collection<Utente> getUserList() {
		return userList;
	}

	public void setUserList(Collection<Utente> userList) {
		this.userList = userList;
	}
}
