<%@ page language="java" import="java.io.*" errorPage="" %>
<html>
<head>
<title>File Handling in JSP</title>
</head>

<body>
<%
String fileName=getServletContext().getRealPath("jsp.txt");

File f=new File(fileName);

InputStream in = new FileInputStream(f);

BufferedInputStream bin = new BufferedInputStream(in);

DataInputStream din = new DataInputStream(bin);

    while(din.available()>0)
    {
     out.print(din.readLine());
    }
in.close();
bin.close();
din.close();
%>
</body>
</html>