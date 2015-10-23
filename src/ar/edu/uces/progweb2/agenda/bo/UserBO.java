package ar.edu.uces.progweb2.agenda.bo;

import ar.edu.uces.progweb2.agenda.dto.FormLoginDTO;
import ar.edu.uces.progweb2.agenda.model.User;

public interface UserBO {

	public User getUser(FormLoginDTO form);
	
}
