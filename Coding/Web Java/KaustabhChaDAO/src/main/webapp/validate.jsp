

<%@page import="java.time.LocalDate"%>
<%@page import="java.util.Map"%>

<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.user.pojo.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%! 
// JSP Declartion block , declare HAshMap here and put data in it
		Map<String,User> map = new HashMap<>();
		
public void jspInit(){
	map.put("nikhil@", new User("nikhil","nikhil@","nj" , LocalDate.parse("2002-01-01")));
	map.put("kb@", new User("kausti","kb@","DAO" , LocalDate.parse("1998-01-01")));
	map.put("pc@", new User("pricne","pc@","PChetan" , LocalDate.parse("2003-01-01")));
	
	System.out.println("Map popliated ");
}


%>
<body>

<%
	System.out.println("Validation Login Scriplet -- jspService");

	User user = map.get(request.getParameter("username"));
	if(user != null)
	{
			if(user.getPassword().equals(request.getParameter("password")))
			{
				session.setAttribute("user_dtls",user);
				
				response.sendRedirect("details.jsp");
			}
			else{
%>
					<h3 style="color:red;">
						Invalid Password
					</h3>
<%
			}
	}
	else{
		
	}
%>

</body>
</html>