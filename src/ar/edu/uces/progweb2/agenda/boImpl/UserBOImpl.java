package ar.edu.uces.progweb2.agenda.boImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ar.edu.uces.progweb2.agenda.bo.UserBO;
import ar.edu.uces.progweb2.agenda.dao.UserDao;
import ar.edu.uces.progweb2.agenda.dto.FormLoginDTO;
import ar.edu.uces.progweb2.agenda.model.User;

@Component("userBO")
public class UserBOImpl implements UserBO {
	
	
	private UserDao userDao;
	
	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public User getUser(FormLoginDTO form) {
		return this.userDao.getUser(form);
	}

}
