<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Amazon : Login</title>
</head>
<body>

<form action="doLogin" method="post">
Email : <input type="text" name="loginEmail" required="required"><br><br>
Password : <input type="text" name="loginPassword" required="required"><br><br>
<input type="submit" value="Login">
</form>

<form action="resetPassword" method="post">
Email : <input type="text" name="email" required="required"><br><br>
Password : <input type="text" name="password" required="required"><br><br>
New Password : <input type="text" name="newPassword" required="required"><br><br>
<input type="submit" value="Reset Password">
</form>


</body>
</html>