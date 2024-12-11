<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calander</title>
</head>
<body>
	<p>Today's Date: <%=(new java.util.Date()).toString() %></P><br>
	<%=2+3*5 %><br>
	<%!
		int a=10;
		int b=20;
		int c=30;
	%>
	<%= a+b+c %><br>
	
	<%="This is a String" %><br>
</body>
</html>