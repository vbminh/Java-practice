<%@page import="Model.Bean.Account"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<%	Account account = (Account) request.getAttribute("account");
	if(account == null)
		return;
%>
</head>
<body>
	<h2 align="center">Welcome <%= account.getUsername() %></h2>
	<div align="center">
		<a href="ShowInfServlet" style="text-decoration: none">Information&emsp;|&emsp;</a>
		<a href="ShowAddServlet" style="text-decoration: none">Add &emsp;|&emsp;</a>
		<a href="#" style="text-decoration: none">Edit &emsp;|&emsp;</a>
		<a href="#" style="text-decoration: none">Delete</a>
	</div>
</body>
</html>