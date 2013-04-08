<%@ page  language="java" import="java.sql.*" %>
<html>
<head>
<title>Query String in JSP</title>
</head>

<body>
<a href="queryString.jsp?id=9&name=joe">This is data inside query string</a>
<%
String queryString=request.getQueryString();
out.print("<br>"+queryString);
%>
</body>
</html>