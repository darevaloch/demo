package com.globant.billing.client.web.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.globant.billing.client.web.model.User;

@Repository
public class UserDAOImpl implements UserDAO {
	
//	private SessionFactory sessionFactory;
    @Autowired
    private SessionFactory sessionFactory;

//	public UserDAOImpl(SessionFactory sessionFactory) {
//		this.sessionFactory = sessionFactory;
//	}

	@Transactional
	public List<User> list() {
		@SuppressWarnings("unchecked")
		List<User> listUser = (List<User>) sessionFactory.getCurrentSession().createCriteria(User.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return listUser;
	}

}
