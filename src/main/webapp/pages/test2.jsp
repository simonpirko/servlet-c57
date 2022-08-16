<%@ page import="by.tms.storage.InMemoryOperationStorage" %>
<%@ page import="by.tms.entity.Operation" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: simonpirko
  Date: 4.08.22
  Time: 7:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib prefix="c" %>--%>
<html>
<head>
	<title>Test2</title>
</head>
<body>
<%--<jsp:include page="test2.jsp"/>--%>

<ul>
	<%

		List<String> items = (List<String>) request.getAttribute("items");
		for (String item: items) {
			out.print("<li>" + item + "</li>");
		}

		boolean flag = Boolean.getBoolean(String.valueOf(request.getAttribute("flag")));

		if (flag){
			out.print("<button>Submit</button>");
		}

	%>
</ul>

<%=request.getAttribute("myName")%>
${myName}

<%

	for (int i = 0; i < 10; i++) {
		out.print("<li>" + i + "</li>");
	}
	int b = 2;
%>


<%! int c = 2; %>

</body>
</html>
