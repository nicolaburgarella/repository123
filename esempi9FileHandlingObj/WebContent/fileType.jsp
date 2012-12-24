<%@ page language="java" import="java.io.*" errorPage="" %>
<html>
<head>
<title>File Handling in JSP</title>
</head>

<body>
<%
String fileName=getServletContext().getRealPath("jsp.txt");

File f=new File(fileName);

out.print("File exists     : "+f.exists()+"<br>");
/// return type is boolean exists return true else false

out.print("File is Directory : "+f.isDirectory()+"<br>");
/// return type is boolean exists return true else false

out.print("File is File : "+f.isFile()+"<br>");
/// return type is boolean exists return true else false

out.print("File is creation Date : "+f.lastModified()+"<br>");
/// return type is boolean exists return true else false

%>
</body>
</html>