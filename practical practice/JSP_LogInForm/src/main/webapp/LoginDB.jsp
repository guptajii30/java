<%@page import="java.sql.ResultSet"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.DriverManager"%>
<%@ page import="java.sql.PreparedStatement"%>
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
	String driverNm = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/logindb";
	String UserName = request.getParameter("UserName");
	String Password = request.getParameter("Password");
	PreparedStatement psmt = null;
	Connection con = null;
	ResultSet rs = null;

	try {
		Class.forName(driverNm);
		con = DriverManager.getConnection(url, "root", "");
		String sql = "SELECT * FROM login WHERE UserName = ? AND Password = ?";
		psmt = con.prepareStatement(sql);
		psmt.setString(1, UserName);
		psmt.setString(2, Password);
		rs = psmt.executeQuery();
		
		if(rs.next()){
			out.print("login Successfully....");
		}else{
			out.print("login Unsuccessfull.....");
		}

	} catch (Exception e) {
			out.print(e);
	}
	finally{
		try{
			psmt.close();
			rs.close();
			con.close();
		}catch(Exception e){
			out.print(e);
		}
	}
	%>
</body>
</html>
