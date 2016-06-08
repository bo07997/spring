package com.ldb.Controller.dao;

import org.hibernate.SessionFactory;

import com.ldb.Controller.entity.User;

public class UserDAO implements IUserDAO {

	private SessionFactory SessionFactory;
	

	public void setSessionFactory(SessionFactory sessionFactory) {
		SessionFactory = sessionFactory;
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub

		SessionFactory.getCurrentSession().save(user);
	}

}
