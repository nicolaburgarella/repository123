<%@ page contentType="text/html; charset=iso-8859-1" language="java" %>
<%
String[] stArray={"bob","riche","jacky","rosy"};
%>

<html>
<body>
    <%
     int i=0;
     for(i=0;i<stArray.length;i++)
     {
      out.print("stArray Elements       :"+stArray[i]+"<br/>");
     }
    %>
</body>
</html>