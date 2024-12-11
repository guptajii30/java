<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%! int day=(java.util.Calendar.getInstance().get(java.util.Calendar.DAY_OF_WEEK)); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>Today's Date is: <%=(new java.util.Date()).toString()%></p>
	<% if (day==1 || day==7){ %>
		<p>Today is WeekEnd</p>
		<%}else{%>
			<p>Today is Not WeekEnd</p>
			<%}%>
		
	<%
		switch(day){
		case 0:
			out.println("It\'s Sunday. ");
		break;
		case 1:
			out.println("It\'s Monday.");
		break;
		default:
			out.println("It\'s Saturday");
		}
	%>
</body>
</html>