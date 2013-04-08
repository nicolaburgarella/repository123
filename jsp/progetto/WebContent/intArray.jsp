<%@ page contentType="text/html; charset=iso-8859-1" language="java" %>
<%
int[] intArray={23,45,13,54,78};
%>

<html>
<body>
    <%
     int i=0;
     for(i=0;i<intArray.length;i++)
     {
      out.print("intArray Elements       :"+intArray[i]+"<br/>");
     }
    %>
</body>
</html>
