package ar.edu.uces.progweb2.agenda.daoImpl;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import ar.edu.uces.progweb2.agenda.dao.UserDao;
import ar.edu.uces.progweb2.agenda.dto.FormLoginDTO;
import ar.edu.uces.progweb2.agenda.model.User;

@Repository("userDao")
public class UserDaoImpl extends GenericDaoImpl<User> implements UserDao{

	@Override
	public User getUser(FormLoginDTO form) {
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(User.class);
		Criterion result = Restrictions.and(Restrictions.eq("user", form.getUser()), Restrictions.eq("password", form.getPassword()));
		return (User) criteria.add(result).uniqueResult();
	}

}
