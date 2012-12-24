<%@ page language="java" import="java.sql.*" %>
<html>
<head>
<title>while loop in JSP</title>
</head>

<body>
<%
String sName="joe";
String sSecondName="noe";
    
    if(sName.equals("joe")){
      out.print("if condition check satisfied JSP count :"+sName+"<br>");
    }

    if(sName.equals("joe") && sSecondName.equals("joe"))
    {
      out.print("if condition check if Block <br>");
    }
    else
    {
      out.print("if condition check else Block <br>");
    }
%>
</body>
</html>