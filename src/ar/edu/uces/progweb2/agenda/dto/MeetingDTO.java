package ar.edu.uces.progweb2.agenda.dto;

import java.util.List;

import ar.edu.uces.progweb2.agenda.model.Guest;
import ar.edu.uces.progweb2.agenda.model.Hall;

public class MeetingDTO extends EventDTO{
	
	private String theme;
	private Hall hall;
	private List<Guest> guests;
	
	public String getTheme() {
		return theme;
	}
	
	public void setTheme(String theme) {
		this.theme = theme;
	}
	
	public Hall getHall() {
		return hall;
	}
	
	public void setHall(Hall hall) {
		this.hall = hall;
	}
	
	public List<Guest> getGuests() {
		return guests;
	}
	
	public void setGuests(List<Guest> guests) {
		this.guests = guests;
	}
	
}
