<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<body>
	<h2>Session management URL REwritting</h2>
	<% int count=1;%>
	<% 
	String param =request.getParameter("count");
	if(param!=null)
		count=Integer.parseInt(param);
	out.println("You have Visited this Page "+count+" time(s)");
	%>
	<a href="UrlSessionDemo.jsp?count=<%= count+1 %>">Hit Again</a>
</body>
</html>