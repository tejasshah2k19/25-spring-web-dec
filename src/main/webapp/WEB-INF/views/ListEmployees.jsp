<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>List Employees</h2>
	
	
	${employees.size()}
	
	<br>
	${employees.get(0).firstName }
	<br>
	${employees.get(1).firstName }

</body>
</html>