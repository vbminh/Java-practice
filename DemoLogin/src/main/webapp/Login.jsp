<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<script type="text/javascript">
function checkLogin() {
     var username = document.getElementById("username").value;
    if (username == "")) {
        alert("You must enter your username!");
    }
        
    
}
</script>
</head>
<body>
	<h1 align="center">Demo Login Web</h1>
	
	<form action="" method="post" onsubmit="checkLogin()">
		<div align="center" style="font-size: 20px;">
			<table>
				<tr height="40px;">
					<td width="100px">Username:</td>
					<td><input type="text" name="username" id="username"></td>
				</tr>
				<tr height="40px;">
					<td width="100px">Password:</td>
					<td><input type="password" name="password" id="password"></td>
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
</body>
</html>