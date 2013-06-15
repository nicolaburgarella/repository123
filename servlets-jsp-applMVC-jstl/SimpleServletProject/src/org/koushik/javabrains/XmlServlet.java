package org.koushik.javabrains;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class XmlServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//System.out.println("XMLServlet called");
		//PrintWriter writer = response.getWriter();
		//writer.println("<h3> Hello in html</h3>");
		//response.getWriter().println("Hello from Servlet GET method - on the web page");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String username= request.getParameter("name");
		HttpSession session = request.getSession();
		ServletContext context = request.getServletContext();
		if(username != "" && username != null){
			session.setAttribute("savedUserName", username);
			context.setAttribute("savedUserName", username);
		}
		//String fullname= request.getParameter("fullname");
		//out.println("Hello from GET method! "+username+" "+ fullname+ "!");
		out.println("Hello from GET method! Request parameter has username as "+username+ "!");
		out.println("Hello from GET method! Session parameter has username as "+(String)session.getAttribute("savedUserName")+ "!");
		out.println("Hello from GET method! Context parameter has username as "+(String)context.getAttribute("savedUserName")+ "!");
		out.println("Hello from GET method! Init parameter has default username as "+this.getServletConfig().getInitParameter("defaultName")+ "!");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//System.out.println("XMLServlet called");
		//PrintWriter writer = response.getWriter();
		//writer.println("<h3> Hello in html</h3>");
		//response.getWriter().println("Hello from Servlet GET method - on the web page");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String username= request.getParameter("username");
		String fullname= request.getParameter("fullname");
		out.println("Hello from POST method! "+username+" "+ fullname+ "!");
		String prof = request.getParameter("prof");
		out.println("you are a " +prof);
		//String location = request.getParameter("location");
		String[] location = request.getParameterValues("location");
		out.println("you are at " +location.length + " places");
		for(int i=0; i<location.length; i++){
			out.println(location[i]);
		}
	}
	
	
	
	
	
}
