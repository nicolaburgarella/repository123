<%@ page contentType="text/html; charset=iso-8859-1" language="java" %>
<%
String checkboxUserNameInJSP=request.getParameter("username");

%>
<html>
<body>
L'utente <%=checkboxUserNameInJSP%> si è loggato.

</body>
</html>