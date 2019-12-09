package com.remya.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping(value="/")
	public String index() {
		return "index";			
	}	
	
	@RequestMapping(value="login")
	public String login() {
		return "login";
	}
	
	@RequestMapping(value="register")
	public String register() {
		return "register";
	}
	
	@RequestMapping(value="hello")
	public ModelAndView hello(HttpServletRequest request,HttpServletResponse response)
	{
		String username = request.getParameter("name");
		String password = request.getParameter("password");
		
		System.out.println("Username :"+username);
		System.out.println(password);
		  
		ModelAndView mv = new ModelAndView();
		mv.setViewName("hello");
		mv.addObject("username", username);
		mv.addObject("password", password);
		return mv;
		
	}

}
