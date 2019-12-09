package com.face.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.face.bo.LoginBO;
import com.face.bo.RegisterBO;
import com.face.dao.LoginDAO;
import com.face.dao.RegisterDAO;
import com.face.util.ConnectionManager;

/**
 * Servlet implementation class LoginServlet
 */

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		String username = request.getParameter("username");
		String passwrd = request.getParameter("passwrd");
		
		LoginBO lbo = new LoginBO();
		lbo.setUsername(username);
		lbo.setPasswrd(passwrd);
		
		List logStatus = null;
		
		ConnectionManager con = new ConnectionManager();
		try {
		logStatus = LoginDAO.save(con.getConnection(),lbo);

		request.setAttribute("List",logStatus);
		RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
        rd.forward(request, response);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	
	}

}
