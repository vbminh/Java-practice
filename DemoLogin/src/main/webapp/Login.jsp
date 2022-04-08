<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Login</title>
	<% 
		String error = (String)request.getAttribute("ErrorString"); 
		if(error == null)
			error = "";
	%>
</head>
<body>
	<h1 align="center">Demo Login Web</h1>
	
	<p style="color: red;" align="center"><%=error%></p>
	
	<form action="LoginController" method="post" >
		<div align="center" style="font-size: 20px;">
			<table>
				<tr height="40px;">
					<td width="100px">Username:</td>
					<td><input type="text" name="username"></td>
				</tr>
				<tr height="40px;">
					<td width="100px">Password:</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td colspan="2">
						<div class="g-recaptcha" data-sitekey="6LczbUAfAAAAACGmUEhvDUkVDimZwrz0VviW4Pc5"></div>
					</td>
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
	
	<script src="https://www.google.com/recaptcha/api.js"></script>
</body>
</html>