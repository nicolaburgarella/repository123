<%@ page contentType="text/html; charset=iso-8859-1" language="java" %>
<%
String[] stArray=new String[4];
stArray[0]="bob";
stArray[1]="riche";
stArray[2]="jacky";
stArray[3]="rosy";
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