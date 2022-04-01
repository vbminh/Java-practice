<%@page import="java.util.List"%>
<%@page import="Model.bean.Information"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%
	Information infor = (Information) request.getAttribute("information");
%>
<title>Result</title>
</head>
<body>
	<%=infor.getSDT() %>>
</body>
</html>