<%@ page contentType="text/html; charset=iso-8859-1" language="java" %>
<%
String checkboxStateInJSP=request.getParameter("state");
String checkboxCityInJSP=request.getParameter("city");
%>
<html>
<body>
Value of checkbox in JSP : <%=checkboxStateInJSP%> <%=checkboxCityInJSP%>

</body>
</html>