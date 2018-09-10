package it.example.ProgettoJPA_Hibernate4_WSRest.classes;

public class TelefonoClass {

	private String modello;
	private int anno;

	public TelefonoClass(String modello, int anno) {
		this.modello = modello;
		this.anno = anno;
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

	public TelefonoClass() {
	}

}
