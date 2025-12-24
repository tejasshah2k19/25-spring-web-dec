<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="calc" method="post">  
		N1: <input type="text" name="n1" /><br>
		<br> N2:<input type="text" name="n2" /><br>
		<br>
		
		Choice : 
					Add <input type="radio" name="choice" value="add"/>
					Mul <input type="radio" name="choice" value="mul"/> Div <input
			type="radio" name="choice" value="div" /> Sub <input
			type="radio" name="choice" value="sub" /><br> <bR> <input type="submit" value="Calc" />
	</form>
</body>
</html>