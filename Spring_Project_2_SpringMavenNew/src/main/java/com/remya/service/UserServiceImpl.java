package com.remya.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.remya.dao.UserDao;
import com.remya.model.Login;
import com.remya.model.User;

public class UserServiceImpl implements UserService {
	
	@Autowired
	public UserDao userDao;
	
	public void register(User user) 
	{
		System.out.println("UserserviceImpl register method");
		userDao.register(user);
		
	}
	
	public User validateUser(Login login)
	{
		System.out.println("login method---UserserveiceImpl");
		return userDao.validateUser(login);
	}

}
