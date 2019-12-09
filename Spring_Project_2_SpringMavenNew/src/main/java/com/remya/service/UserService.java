package com.remya.service;

import com.remya.model.Login;
import com.remya.model.User;

public interface UserService {
	
	void register(User user);
	
	User validateUser(Login login);

}
