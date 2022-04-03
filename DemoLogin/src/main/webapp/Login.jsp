<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Login</title>
</head>
<body>
	<h1 align="center">Demo Login Web</h1>
	
	<p style="color: red;">${ErrorString}</p>
	
	<form name="LoginForm" action="LoginController" method="post" onsubmit="checkLogin()">
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
						<div class="recaptcha" 
							data-sitekey="6LczbUAfAAAAACGmUEhvDUkVDimZwrz0VviW4Pc5"></div>
					</td>
				</tr>
				<tr height="40px;">
					<td colspan="2" align="center">
						<input type="submit" name="Submit" value="Submit">
						&ensp;<input type="reset" name="Reset" value="Reset">
					</td>
				</tr>
			</table>
		</div>	
	</form>
	
	<script type="text/javascript" src="https://www.google.com/recaptcha/api.js?hl=vi">
	function checkLogin() {
     	var username = document.LoginForm.username.value;
     	var password = document.LoginForm.password.value;
     	
    	if(username == null || username == "")
    		alert("You must enter your username");
    	if(password == null || password == "")
    		alert("You must enter your password");
	}
	</script>
</body>
</html>