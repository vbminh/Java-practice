<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<form action="LoginController" method="post">
		<h2 align="center">Login to website</h2>
		<p align="center">Username: <input type="text" name="username" ></p>
		<p align="center">Password: <input type="password" name="password" ></p>
		<div align="center">
			<input type="submit" name="Submit" value="Submit">
			&ensp;<input type="reset" name="Cancel" value="Cancel ">
		</div>
	</form>
</body>
</html>