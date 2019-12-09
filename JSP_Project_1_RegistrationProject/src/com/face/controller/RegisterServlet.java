package com.face.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.face.bo.RegisterBO;
import com.face.dao.RegisterDAO;
import com.face.util.ConnectionManager;

/**
 * @author Remya
 * @implSpec class to perform user  Registration
 * Date : 14-11-2019
 * @category controller class
 */

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @implSpec -->Action method to register customer with DB
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		String name = request.getParameter("uname");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String password = request.getParameter("password");
		String place = request.getParameter("place");
		
		RegisterBO regbo = new RegisterBO();
		regbo.setName(name);
		regbo.setEmail(email);
		regbo.setPhone(phone);
		regbo.setPassword(password);
		regbo.setPlace(place);
		
		boolean regStatus = false;
		ConnectionManager con = new ConnectionManager();
		try {
		regStatus = RegisterDAO.save(con.getConnection(),regbo);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		if(regStatus == true)
		{
			response.sendRedirect("login.jsp");
		}
		else
		{
			response.sendRedirect("fail.jsp");
		}
		
	}

}
