<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%! int visitCount = 1; %>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%
		//get seesion creation time
		Date createTime = new Date(session.getCreationTime());
		//get last access time
		Date lastAccessTime = new Date(session.getLastAccessedTime());
		
		String title ="welcome back to website";
		
		String visitCountKey = new String("visitCount");
		String userIDKey = new String("1245");
		String userID = new String("Ganesh");
		
		session.setAttribute(visitCountKey, visitCount);
		
		if(session.isNew()){
			title = "welcome to website";
			session.setAttribute(userIDKey, userID);
			session.setAttribute(visitCountKey, visitCount);
		}
		else{
			visitCount =(Integer)session.getAttribute(visitCountKey);
			visitCount = visitCount + 1;
			session.setAttribute(visitCountKey, visitCount);
		}
		userID = (String)session.getAttribute(userIDKey);
	%>
	UserID=<%=userID %><br>
	User ID Key=<%=userIDKey %><br>
	Session Creation Time= <%=createTime %><br>
	Last Access Time = <%=lastAccessTime %><br>
	Visit Count = <%=visitCount %><br>
	User ID =<%= title %><br>
</body>
</html>