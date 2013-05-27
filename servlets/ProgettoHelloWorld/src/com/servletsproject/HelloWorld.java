package com.servletsproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public HelloWorld() {
        // TODO Auto-generated constructor stub
    	super();
    	System.out.println("IN CONSTRUCTOR");
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("IN INIT");	
	}
	
	/**
	 *  service method
	 */
		
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
	
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("IN HELLOWORLD DOGET");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("Hello World");
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("IN HELLOWORLD DOPOST");
	}
	
	public void destroy(){
		System.out.println(" IN HELLOWORLD DESTROY");
	}

}
