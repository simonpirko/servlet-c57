<%--
  Created by IntelliJ IDEA.
  User: simonpirko
  Date: 9.08.22
  Time: 8:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Login</title>
</head>
<body>
<form action="/login" method="post">
	<input type="text" name="username" />
	<input type="password" name="password" />
	<button>Submit</button>
</form>
<p>${message}</p>
</body>
</html>
