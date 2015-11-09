package ar.edu.uces.progweb2.agenda.dto;

public class PrivateEventDTO extends EventDTO {
	
	private String description;
	private String address;
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
}
