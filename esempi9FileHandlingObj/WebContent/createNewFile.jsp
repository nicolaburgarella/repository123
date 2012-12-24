<%@ page language="java" import="java.io.*" errorPage="" %>
<html>
<head>
<title>File Handling in JSP</title>
</head>

<body>
<%
String fileName=getServletContext().getRealPath("test.txt");

File f=new File(fileName);

f.createNewFile();

%>
</body>
</html>