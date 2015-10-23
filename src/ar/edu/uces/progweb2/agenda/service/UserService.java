package ar.edu.uces.progweb2.agenda.service;

import ar.edu.uces.progweb2.agenda.dto.FormLoginDTO;
import ar.edu.uces.progweb2.agenda.model.User;

public interface UserService {
	
	public User getUser(FormLoginDTO form);
}
