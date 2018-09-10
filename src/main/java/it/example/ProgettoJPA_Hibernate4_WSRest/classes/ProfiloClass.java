package it.example.ProgettoJPA_Hibernate4_WSRest.classes;

public class ProfiloClass {

	private static final long serialVersionUID = 1L;
	private String ruolo;
	private int salario;

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

	public ProfiloClass(String ruolo, int salario) {
		this.ruolo = ruolo;
		this.salario = salario;
	}

	public ProfiloClass() {
	}

}
