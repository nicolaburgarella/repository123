<%@ page language="java" import="java.sql.*" %>
<%
String parameterValue="This is application object";
    
    getServletContext().setAttribute("ApplicationValue","This is my Name");
    String getValueApplcation=(String)getServletContext().getAttribute("ApplicationValue");
    
    application.setAttribute("ApplcationVariable",parameterValue);
    String getApplicationVariable=(String)application.getAttribute("ApplcationVariable");
%>
<html>
<head>
<title>Applcation object in JSP</title>
</head>

<body>
The value of getting getServletContext application object <%=getValueApplcation%><br>
This is application object :<%=getApplicationVariable%>
</body>
</html>
