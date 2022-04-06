<%@page import="Model.Bean.Account"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<%
	Account account = (Account) request.getAttribute("account");
	if(account == null)
		return;
%>
</head>
<body>
	<h2 align="center">Welcome <%=account.getUsername()%></h2>
	<div align="center" style="text-decoration: none;">
		<a href="#">Information</a>
		<a href="#">Add</a>
		<a href="#">Edit</a>
		<a href="#">Delete</a>
	</div>
</body>
</html>