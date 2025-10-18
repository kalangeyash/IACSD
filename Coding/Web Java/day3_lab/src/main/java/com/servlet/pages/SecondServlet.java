package com.servlet.pages;

        import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



public class SecondServlet extends HttpServlet {
	
	public void init() throws ServletException {

		System.out.println("[ in INIT method : " + getClass() + " ]");
		
		
	}



	public void destroy() {
		System.out.println("[ in DESTROY method : " + getClass() + " ]");
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("[ in GET method : " + getClass() + " ]");
		
		response.setContentType("text/html");
		
		try(PrintWriter pw = response.getWriter())
		{
			pw.println("<h2 style='text-color:purple'>Hello from [ " + getClass()+" ] @  { "+ LocalTime.now()+ " }</h2>");
		}
	}

}
