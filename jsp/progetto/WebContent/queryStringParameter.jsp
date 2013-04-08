<%@ page  language="java" import="java.sql.*" %>
<html>
<head>
<title>Query String in JSP</title>
</head>

<body>
<a href="queryString.jsp?id=9&name=joe">This is data inside query string</a>
<%
String queryStringVariable1=request.getParameter("id");
String queryStringVariable2=request.getParameter("name");
out.print("<br>"+queryStringVariable1);
out.print("<br>"+queryStringVariable2);
%>
</body>
</html>
