<%--
  Created by IntelliJ IDEA.
  User: simonpirko
  Date: 4.08.22
  Time: 8:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Calc</title>
</head>
<body>
<form action="/calculator" method="post">
	<input type="number" name="num1" placeholder="Num 1">
	<input type="number" name="num2" placeholder="Num 2">
	<input type="text" name="operation" placeholder="Operation">
	<button>Submit</button>
</form>
<p>${result.result}</p>
</body>
</html>
