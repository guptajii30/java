<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!
		int addNum(int n1, int n2){
			return n1+n2;		
		}
	%>
	
	<%
		int result = addNum(5, 10);
	%>
	
	<P> 
		the result is : <%= result %>
	</P>
</body>
</html>

<%@ include file="footer.jsp" %>