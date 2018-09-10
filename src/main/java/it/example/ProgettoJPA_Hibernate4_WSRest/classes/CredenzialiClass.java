package it.example.ProgettoJPA_Hibernate4_WSRest.classes;

public class CredenzialiClass {

	private static final long serialVersionUID = 1L;
	private String username;
	private String password;

	public CredenzialiClass(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public CredenzialiClass() {
	}

}
