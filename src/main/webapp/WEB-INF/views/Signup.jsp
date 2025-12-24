<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="saveUser" method="post">
	
		FirstName : <input type="text" name="firstName"/>
		${result.getFieldError("firstName").defaultMessage }
		<br><br>
		LastName  :<input type="text" name="lastName"/>
		${result.getFieldError("lastName").defaultMessage }
		<br><br>
		Email   : <input type="text" name="email"/>
		${result.getFieldError("email").defaultMessage }
		<br><br>
		Password : <input type="password" name="password"/>
		${result.getFieldError("password").defaultMessage }
		<br><br>
			<input type="submit" value="Signup"/> 
	
	</form>
	<br><Br>
	
	<a href="login">Login</a>

</body>
</html>