package com.sharadballepu.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class for Servlet: LoginServlet
 *
 */
 public class LoginServ extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {

	 int count=1;
	 public LoginServ() {
		super();
		System.out.println("IN CONSTRUCTOR");	
	}   	

	
	public void init()
	{
		System.out.println("IN INIT");	
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		System.out.println("IN SERVICE");

		if ("GET".equalsIgnoreCase(request.getMethod()))
		{
			doGet(request, response);
		} 
		else if("POST".equalsIgnoreCase(request.getMethod()))
		{
			doPost(request, response);
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession sess = request.getSession();
		System.out.println("IN DOGET");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
   		    out.println("<html>");
	        out.println("<body>");
	        out.println("This is request number: "+count);
			count++;
	        out.println("<form method=\"post\" action=\"ValidateServ\">");
	        out.println("<table border=\"2\" width=\"20%\">");
	        out.println("<tr><td>Username:</td>");
	        out.println("<td><input name=\"userName\" maxlength=\"10\"></td></tr>");
	        out.println("<tr><td>Password:</td>");
	        out.println("<td><input type=\"password\" name=\"password\" maxlength=\"10\"></td></tr>");
	        out.println("<tr><td colspan=\"2\" align=\"center\"><input type=\"submit\" name=\"Login\" value=\"Login\"></td></tr>");
	        out.println("</table>");
	        out.println("</form>");
	        out.println("</body>");
	        out.println("</html>");
	}  	
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("IN DOPOST");	
	}   	  	    
	
	public void destroy()
	{
		System.out.println(" IN DESTROY");
	}
 }