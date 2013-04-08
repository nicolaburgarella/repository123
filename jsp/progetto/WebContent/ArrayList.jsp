<%@ page import="java.util.ArrayList" language="java" %>
<%
ArrayList ar=new ArrayList();
ar.add("bob");
ar.add("riche");
ar.add("jacky");
ar.add("rosy");
%>

<html>
<body>
    <%
     int i=0;
     for(i=0;i<ar.size();i++)
     {
      out.print("ArrayList Elements       :"+ar.get(i)+"<br/>");
     }
    %>
</body>
</html>
