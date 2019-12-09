package com.remya.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.remya.model.Login;
import com.remya.model.User;
import com.remya.service.UserService;

public class LoginController {
	@Autowired
	UserService userservice;
	
	@RequestMapping(value="loginProcess", method = RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request,HttpServletResponse response,Login login)
	{
		System.out.println("login control starts");
		ModelAndView mv = null;
		User user = userservice.validateUser(login);
		System.out.println("again in login control page");
		if(null!=user)
		{
			mv = new ModelAndView("welcome");
			mv.addObject("firstname", user.getUsername());
		}
		else
		{
			mv = new ModelAndView("login");
			mv.addObject("message", "Invalid username or password");
		}
		return mv;
	}
	

}
