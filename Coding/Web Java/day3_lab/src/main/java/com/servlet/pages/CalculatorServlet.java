package com.servlet.pages;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class CalculatorServlet
 */
@WebServlet("/calculate")
public class CalculatorServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		int n1 = Integer.parseInt(request.getParameter("num1"));
		int n2 = Integer.parseInt(request.getParameter("num2"));
		
		String operation = request.getParameter("action");
		
		int ans = 0;
		
		switch(operation)
		{
		case "add":
			ans = n1+n2;
			System.out.println(ans);
			break;
		case "subtract":
			ans = n1-n2;
			break;
		case "multiply":
			ans = n1*n2;
			break;
		case "divide":
			if(n2 == 0)
			{
				break;
			}
			ans = n1/n2;
			break;

		}
			
		try(PrintWriter pw = response.getWriter())
		{
			pw.println("<h1> "+ operation + "</h1>");
			
			if(n2==0 && operation.equals("divide"))
			{
				System.out.println("Cant divide by zero");
				pw.println("<h1> Cant "+ operation + " by 0</h1>");
			}
				
			pw.println("<h3> "+n1 + " " + operation + " "+ n2+ " = " + ans + "</h3>");
		}
		
		
	}

}
