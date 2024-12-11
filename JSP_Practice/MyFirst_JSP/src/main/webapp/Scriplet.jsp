<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% int num1=40;
	   int num2=23;
	   int num3=num1+num2;
	   out.println("Scriptel Number Is: "+num3);
	   out.println("<br>");
	%>
	<% String string = "JSP Scriptel";%>
	<% if (string.equals("JSP Scriptel")){ %>
		Hi
	<%} else {%>
		Hello
		<%}%>
</body>
</html>