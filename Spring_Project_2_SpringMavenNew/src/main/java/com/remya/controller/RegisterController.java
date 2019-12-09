package com.remya.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.remya.model.Login;
import com.remya.model.User;
import com.remya.service.UserService;

@Controller
public class RegisterController {
	@Autowired
	public UserService userservice;
	
	@RequestMapping("/")
	public ModelAndView index()
	{
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}
	
	@RequestMapping("login")
	public ModelAndView login()
	{
		ModelAndView mv = new ModelAndView("login");
		return mv;
	}
	
	@RequestMapping("register")
	public ModelAndView register()
	{
		ModelAndView mv = new ModelAndView("register");
		return mv;
	}
	
	@RequestMapping(value="registerProcess", method = RequestMethod.POST)
	public ModelAndView adduser(HttpServletRequest request,HttpServletResponse response,User user)
	{
		System.out.println("register process adduser method");
		userservice.register(user);
		System.out.println("register process adduser method again9999");
		return new ModelAndView("welcome","Firstname",user.getUsername());
	}
	
	@RequestMapping(value="loginProcess", method = RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request,HttpServletResponse response,Login login)
	{
		System.out.println("login control starts");
		ModelAndView mv = null;
		User user = userservice.validateUser(login);
		System.out.println("again in login control page");
		if(null!=user)
		{
			System.out.println("Entered ...Congrats..");
			mv = new ModelAndView("welcome");
			mv.addObject("Firstname", user.getUsername());
		}
		else
		{
			System.out.println("INVALID");
			mv = new ModelAndView("login");
			mv.addObject("message", "Invalid username or password");
		}
		return mv;
	}
	
}
