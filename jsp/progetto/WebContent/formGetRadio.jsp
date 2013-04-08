<%@ page  language="java" import="java.sql.*" %>
<%
String inputVariable=request.getParameter("name");
String[] radioVariable=request.getParameterValues("className");
%>
<html>
<head>
<title>Query String in JSP</title>
</head>

<body>
<%
try{
    out.print("<br>Field 1 :"+inputVariable);
    
    for(int i=0;i<=radioVariable.length;i++){
     out.print("<br>Check box Field "+i+" :"+radioVariable[i]);
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
 <input type="radio" name="className" value="c1"> 
 class 2 <input type="radio" name="className" value="c2"><br><br>
<input type="submit" name="submit" value="Submit">
</form>
</body>
</html>