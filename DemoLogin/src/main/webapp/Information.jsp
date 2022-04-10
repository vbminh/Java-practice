<%@page import="Model.Bean.Account"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Information</title>
<%
	Account account = (Account) request.getAttribute("account");
	if(account == null)
		return;
%>
</head>
<body>
	<h2 align="center">Information</h2>
	<a href="ShowHomeServlet" style="text-decoration: none;">Quay lai<br></a>
	<label>Name: </label><%=account.getName() %><br>
	<label>Age: </label><%=account.getAge() %><br>
	<label>Address: </label><%=account.getAddress() %><br>
	<label>Phone number: </label><%=account.getPhoneNumber() %>
</body>
</html>