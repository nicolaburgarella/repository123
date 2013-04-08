<%@ page language="java" import="java.util.*"%>
<%
String sessionSet=request.getParameter("sessionVariable");
session.setAttribute("MySession",sessionSet);
/// String getSessionValue= (String)session.getAttribute("sessionSet"); 
//this is use for session value in String data

%>

<html>
<head>
<title>Cookie Create Example</title>
</head>
<body>
Session :    <%=(String)session.getAttribute("MySession")%>
<br>
<br>
<form name="frminv" method="get" action="sessionInv.jsp">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td width="22%">&nbsp;</td>
    <td width="78%">&nbsp;</td>
    </tr>
  <tr>Vuoi invalidare la sessione corrente?
    <td>si <input type="checkbox" name="answer" value="si"></td>
    <td>no <input type="checkbox" name="answer" value="no"></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td><input type="submit" name="submit" value="Submit"></td>
    </tr>
  <tr>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    </tr>
</table>
</form>
</body>
</html>