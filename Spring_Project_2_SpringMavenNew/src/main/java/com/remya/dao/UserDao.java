package com.remya.dao;

import com.remya.model.Login;
import com.remya.model.User;

public interface UserDao {
	
	void register(User user);
	
	User validateUser(Login login);

}
