<%@ page language="java" import="java.io.*" errorPage="" %>
<html>
<head>
<title>File Handling in JSP</title>
</head>

<body>
<%
String fileName=getServletContext().getRealPath("jsp.txt");

File f=new File(fileName);

boolean flag=f.renameTo(new File(getServletContext().getRealPath("myJsp.txt")));
if(flag==true){
	out.print("file rinominato");
}
else{
	out.print("file non rinominato");
}
%>
</body>
</html>
