< %@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Session Management Using Hidden From Field</h2>
	<form name="frm" method="post" action="HiddenFieldDemo1.jsp">
	Enter your name<input type="text" name="name"><br>
	<input type="hidden" name="sessionVal" value="firefox">
	<input type="submit" name="submit" value="submit">
	</form>
</body>
</html>