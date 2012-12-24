<%@ page language="java" import="java.util.*"%>
<%
String cookieSet=request.getParameter("cookieSet");

Cookie cookie = new Cookie ("cookieSet",cookieSet);
response.addCookie(cookie);
%>

<html>
<head>
<title>Cookie Create Example</title>
</head>
<body>
    <%
   Cookie[] cookies = request.getCookies();
    
    for (int i=0; i<cookies.length; i++) {
      out.println(cookies[i].getName()+" : "+cookies[i].getValue()+"<br/>");
    }
    %>
</body>
</html>