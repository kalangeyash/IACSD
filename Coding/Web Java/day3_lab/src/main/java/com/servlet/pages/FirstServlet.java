package com.servlet.pages;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;


@WebServlet(value= "/first" , loadOnStartup = 1)
public class FirstServlet extends HttpServlet {


	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("[ in INIT method : " + getClass() + " ]");
	}


	public void destroy() {

		System.out.println("[ in DESTROY method : " + getClass() + " ]");
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("[ in SERVICE method : " + getClass() + " ]");
		response.setContentType("text/html");
		
		
		try(PrintWriter pw = response.getWriter())
		{
			pw.println("<h2 style='text-color:purple'>Hello from [ " + getClass()+" ] @  { "+ LocalTime.now()+ " }</h2>");
		}
	}

}
