<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Radius</title>
</head>
<body>
	<h1>On Declaration Pages</h1>
	<img alt="PHOTO" src="circle.jpeg"style="width: 110px; height: 100px">
	<%!
		class Circle{
			int rad;
			Circle(int r){
				rad=r;
			}
			public String toString(){
				return "Radius of circle is: "+rad+" ";
			}
	}
	Circle a = new Circle(2);
	%>
	<% out.println("<br>"); %>
	<%
		out.println(a);
	%>
	
</body>
</html>