<%@ page language="java" import="java.io.*" errorPage="" %>
<html>
<head>
<title>File Handling in JSP</title>
</head>

<body>
<%
String fileName=getServletContext().getRealPath("test.txt");
//// If you know path of the file, can directly put path instead of 
///filename e.g c:/tomcat/webapps/jsp/myFile.txt
File f=new File(fileName);

boolean flag=f.delete(); 
///return type is boolean if deleted return true, otherwise false
if(flag==true){
	out.print("file cancellato");
}
else{
	out.print("file non cancellato");
}

%>
</body>
</html>