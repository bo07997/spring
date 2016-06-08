package com.ldb.Controller.service;

import com.ldb.Controller.dao.IUserDAO;
import com.ldb.Controller.entity.User;

public class UserManager implements IUserManager {

	private IUserDAO UserDAO;
	
	
	public void setUserDAO(IUserDAO userDAO) {
		UserDAO = userDAO;
	}

	@Override
	public void addUser(User user) {

		UserDAO.addUser(user);
	}

}
