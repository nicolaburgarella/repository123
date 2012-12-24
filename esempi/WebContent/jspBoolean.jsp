<%@ page contentType="text/html; charset=iso-8859-1" language="java" %>
<%
boolean checkCondition=false;
%>

<html>
<body>
    <%
    if(checkCondition==true)
    {
      out.print("This condition is true");
    }
    else
    {
      out.print("This condition is false");
    }
    %>
</body>
</html>