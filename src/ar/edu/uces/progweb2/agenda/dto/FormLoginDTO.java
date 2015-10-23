package ar.edu.uces.progweb2.agenda.dto;

public class FormLoginDTO {
	
	private String user;
	private String password;
	private boolean remenber;

	public String getUser() {
		return user;
	}
	
	public void setUser(String user) {
		this.user = user;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean getRemenber() {
		return remenber;
	}

	public void setRemenber(boolean remenber) {
		this.remenber = remenber;
	}

}
