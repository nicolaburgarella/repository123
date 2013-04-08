<%@ page language="java" errorPage="" %>
<jsp:useBean id="myLog" class="jsp.FirstBean" scope="page"/>

<%
  myLog.setSName("Amit");
  myLog.setIClass(10);
  myLog.setIMarks(89);
  myLog.setIMaxMarks(120);
%>
<html>
<head>
<title>useBean Action tags JSP</title>
</head>

<body>
<%=myLog.getSName() %> Percent is <%=myLog.getDPercent()%>
</body>
</html>

