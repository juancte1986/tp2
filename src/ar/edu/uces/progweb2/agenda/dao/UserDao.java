package ar.edu.uces.progweb2.agenda.dao;

import ar.edu.uces.progweb2.agenda.dto.FormLoginDTO;
import ar.edu.uces.progweb2.agenda.model.User;

public interface UserDao extends GenericDao<User>{
	
	public User getUser(FormLoginDTO form);
}
