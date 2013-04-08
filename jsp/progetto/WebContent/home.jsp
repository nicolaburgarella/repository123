<%@ page language="java" import="java.sql.*" %>
<html>
<head>
<title>Include example of JSP</title>
</head>

<body>
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td colspan="3" align="center"><%@ include file="header.jsp"%></td>
  </tr>
  <tr>
    <td width="16%" height="138">&nbsp;</td>
    <td width="65%" align="center">This is Home page and having
                    header and footer included by include of JSP </td>
    <td width="19%">&nbsp;</td>
  </tr>
  <tr>
    <td colspan="3" align="center"><%@ include file="footer.jsp"%></td>
  </tr>
</table>

</body>
</html>
