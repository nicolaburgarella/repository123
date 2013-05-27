package com.sharadballepu.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class for Servlet: SucessServ
 *
 */
 public class SuccessServ extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
	public SuccessServ() {
		super();
	}   	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("IN SUCESSSERV DOGET");
	}  	
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sess = request.getSession();
		// TODO Auto-generated method stub
		System.out.println("IN SUCESSSERV DOPOST");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
	        out.println("<html>");
	        out.println("<body>");
	        out.println("COOKIE:" + request.getHeader("cookie"));
	        out.println("Congratulations! You have entered the correct username and password");
	        out.println("</body>");
	        out.println("</html>");

	}   	  	    
}