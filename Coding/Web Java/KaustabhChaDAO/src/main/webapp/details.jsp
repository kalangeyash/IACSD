<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Login Successful</h1>
<h2> User details -  ${sessionScope.user_dtls} </h2>
<h5>
	<a href = "logout.jsp"> CLick here to logout </a>
</h5>
</body>
</html>