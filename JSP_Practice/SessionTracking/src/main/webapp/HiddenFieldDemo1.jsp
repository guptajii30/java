<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Session Management using Hidden Form Field</h2>
	<%
	  String name=request.getParameter("Ganesh Gupta");
	  String sessionVal=request.getParameter("sessionVal");
	  out.println("Wellcome " +name+ " and SessionVal= " +sessionVal);
	%>
</body>
</html>