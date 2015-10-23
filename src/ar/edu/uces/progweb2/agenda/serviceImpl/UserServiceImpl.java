package ar.edu.uces.progweb2.agenda.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.uces.progweb2.agenda.bo.UserBO;
import ar.edu.uces.progweb2.agenda.dto.FormLoginDTO;
import ar.edu.uces.progweb2.agenda.model.User;
import ar.edu.uces.progweb2.agenda.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	private UserBO userBO;
	
	@Autowired
	public void setUserBO(UserBO userBO) {
		this.userBO = userBO;
	}

	@Override
	public User getUser(FormLoginDTO form) {
		return userBO.getUser(form);
	}

}
