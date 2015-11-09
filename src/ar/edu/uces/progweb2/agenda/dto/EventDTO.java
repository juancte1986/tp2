package ar.edu.uces.progweb2.agenda.dto;

import ar.edu.uces.progweb2.agenda.model.User;

public abstract class EventDTO {
	
	private long id;
	private String name;
	private String startTime;
	private String endTime;
	private User owner;
	
	public EventDTO(){
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}
	
}
