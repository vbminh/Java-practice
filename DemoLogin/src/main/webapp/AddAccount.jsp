<%@page import="Model.Bean.Account"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add</title>
<%
	String error = (String) request.getAttribute("error");
	if(error == null)
		error = "";
%>
</head>
<body>
	<h2 align="center">Add Account</h2>
	
	<p style="color: red;" align="center"><%=error %></p>
	
	<form action="ShowAddForm" method="post" >
		<div align="center" style="font-size: 20px;">
			<table>
				<tr height="40px;">
					<td width="150px">Username:</td>
					<td><input type="text" name="username"></td>
				</tr>
				<tr height="40px;">
					<td width="150px">Password:</td>
					<td><input type="password" name="password"></td>
				</tr>
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
						&ensp;<input type="reset" name="Cancel" value="Cancel">
					</td>
				</tr>
			</table>
		</div>	
	</form>

</body>
</html>