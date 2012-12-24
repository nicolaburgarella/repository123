<%@ page  language="java" import="java.sql.*" %>
<%
String queryStringVariable1=request.getParameter("name");
String[] queryStringVariable2=request.getParameterValues("className");
%>
<html>
<head>
<title>Query String in JSP</title>
</head>

<body>
<%
try{
    out.print("<br>Field 1 :"+queryStringVariable1);
    
    for(int i=0;i<=queryStringVariable2.length;i++){
     out.print("<br>Check box Field "+i+" :"+queryStringVariable2[i]);
    }
}
catch(Exception e)
{
 e.printStackTrace();
}

%>
<br>
<br>
<form method="get" name="form1">
Name <input type="text" name="name"> <br><br>
 class 1
 <input type="checkbox" name="className" value="c1">
 class 2 <input type="checkbox" name="className" value="c2"><br><br>
<input type="submit" name="submit" value="Submit">
</form>
</body>
</html>
