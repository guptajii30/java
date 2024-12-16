<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Form</title>
</head>
<body>
	<h1>Registration Form</h1>
	 <form action="" method="POST">
	 	Enter name: <input type="text" name="name" required="required"/><br><br>
	 	Enter Age: <input type="text" name="Age" required="required"/><br><br>
	 	Enter roll No: <input type="text" name="rollNo" required="required"/><br><br>
	 	<button type="submit">Submit</button><br>
	 </form>
	 
	 <%
	 	String name = request.getParameter("name");
	 String Age = request.getParameter("Age");
	 String rollNo = request.getParameter("rollNo");
	 
	 %>
	 <p>
	 	<h3>Information of Forms.....<br></h3>
	 	NAME IS: <%= name %><br>
	 	AGE IS: <%=Age %><br>
	 	Roll No IS: <%=rollNo %>
	 	 
	 </p>
</body>
</html>