<%@page import="Model.Bean.Account"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit</title>
<%
	Account account = (Account) request.getAttribute("account");
	if(account == null)
		return;
	
	String error = (String) request.getAttribute("error");
	if(error == null)
		error = "";
%>
</head>
<body>
	<h2 align="center">Edit Information</h2>
	
	<p style="color: red;" align="center"><%=error %></p>
	
	<form action="ShowEditForm" method="post" >
		<div align="center" style="font-size: 20px;">
			<table style="align-content: left;">
				<tr height="40px;">
					<td width="300px">Name: <%=account.getName() %></td>
					<td width="300px">Address: <%=account.getAddress() %></td>
				</tr>
				<tr height="40px;">
					<td width="300px">Age: <%=account.getAge() %></td>
					<td width="300px">Phone number: <%=account.getPhoneNumber() %></td>
				</tr>
			</table>
			<hr align="center" width="600px;">
			<table>
				<tr height="40px;">
					<td width="150px">Name:</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr height="40px;">
					<td width="150px">Age:</td>
					<td><input type="text" name="age"></td>
				</tr>
				<tr height="40px;">
					<td width="150px">Address:</td>
					<td><input type="text" name="address"></td>
				</tr>
				<tr height="40px;">
					<td width="150px">Phone number:</td>
					<td><input type="text" name="phone"></td>
				</tr>
				
				<tr height="40px;">
					<td colspan="2" align="center">
						<input type="submit" name="Submit" value="Submit">
						&ensp;<input type="reset" name="Cancel" value="Cancel" onclick="location.href='ShowHomeServlet'">
					</td>
				</tr>
			</table>
		</div>	
	</form>

</body>
</html>