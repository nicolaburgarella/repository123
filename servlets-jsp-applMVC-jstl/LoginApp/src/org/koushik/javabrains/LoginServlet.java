package org.koushik.javabrains;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.koushik.javabrains.dto.User;
import org.koushik.javabrains.service.LoginService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userID, password;
		userID=request.getParameter("userID");
		password=request.getParameter("password");
		
		LoginService loginService = new LoginService();
		
		boolean result = loginService.authenticate(userID, password);
		
		if(result){
			User user = loginService.getUserDetails(userID);
			//request.getSession().setAttribute("user", user);
			request.setAttribute("user", user);
			//response.sendRedirect("success.jsp");
			RequestDispatcher dispatcher = request.getRequestDispatcher("success.jsp");
			dispatcher.forward(request, response);
			return;
		}
		else{
			response.sendRedirect("login.jsp");
			return;
		}
		
	}

}
