<%@ page  language="java" import="java.sql.*" %>
<%
String queryStringVariable1=request.getParameter("name");
String queryStringVariable2=request.getParameter("className");
%>
<html>
<head>
<title>Query String in JSP</title>
</head>

<body>
<%

out.print("<br>Field 1 :"+queryStringVariable1);
out.print("<br>Field 2 :"+queryStringVariable2);

%>

<form method="get" name="form1">
Name <input type="text" name="name"> <br><br>
Class <input type="text" name="className"> <br><br>
<input type="submit" name="submit" value="Submit">
</form>
</body>
</html>