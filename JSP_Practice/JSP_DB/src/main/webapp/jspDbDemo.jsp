<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Integer rollNo = Integer.parseInt(request.getParameter("rollNo"));	
		String StudNm = request.getParameter("name");
		
		String drivernm = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/student";

		
		try{
			//1.Load driver
			Class.forName(drivernm);

			
			Connection con = DriverManager.getConnection(url, "root", "");
			
			Statement stmt = con.createStatement();
			
			String sql = "INSERT INTO stud VALUES("+rollNo+ ", '"+StudNm+"')";
			int noofRowAffected = stmt.executeUpdate(sql);
			if (noofRowAffected != 0)
				System.out.print(" Value is Inserted");
			else
				System.out.print("Value Not Inserted....");
		}catch(Exception e){
			System.out.print(e);
		}
	%>
	<a href="selectAll.jsp">Click Here to Display The Records</a>
</body>
</html>