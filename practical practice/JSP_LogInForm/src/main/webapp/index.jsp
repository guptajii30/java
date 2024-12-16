<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Log In Form</title>
</head>
<body>
    <h1>Log in Form...</h1>
    <form action="LoginDB.jsp" method="POST">
        UserName: <input type="text" name="UserName" required="required" /><br><br>
        Password: <input type="password" name="Password" required="required" /><br><br>
        <button type="submit">Submit</button>
    </form>
</body>
</html>
