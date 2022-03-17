<%@page import="Model.Account" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Success</title>
</head>
<body>
	<%Account acc = (Account) request.getAttribute("account"); %>
	<h1>Welcome <%out.print(acc.getUsername());%></h1>
</body>
</html>