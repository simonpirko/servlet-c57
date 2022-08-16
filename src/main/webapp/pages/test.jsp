<%--
  Created by IntelliJ IDEA.
  User: simonpirko
  Date: 4.08.22
  Time: 7:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<html>
<head>
	<title>Test</title>
</head>
<body>
<c:if test="${flag}">
	<p>Hello World</p>
</c:if>

<f:formatDate value="${date}" pattern="dd.MM.yy hh.mm.ss"/>
<f:parseDate value="09.08.22 8.45.23" pattern="dd.MM.yy hh.mm.ss"/>

<f:formatNumber value="${number}" pattern="#,##0.00"/>
<f:parseNumber value="1.234" pattern="#,##0.00"/>
<%--<sql:query var="result" dataSource="${dataSource}" statement="${statement}"/>--%>

<%--<c:out value="${flag}"/>--%>
${flag}

<%=request.getAttribute("flag")%>

<c:choose>
	<c:when test="${flag}">
		<p>Hello World</p>
	</c:when>
	<c:otherwise>
		<p>Hello World</p>
	</c:otherwise>
</c:choose>

<c:forEach items="${items}" var="item">
	<li>${item}</li>
</c:forEach>
</body>
</html>
