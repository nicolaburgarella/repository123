<%@ page language="java" %>

<html>
<head>
<title>Header page</title>
<style>
.header
{
  background-color:#CBE0E7; 
  font-weight:bold;
  text-align:center
}
</style>
</head>

<body>
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td class="header"><%=request.getParameter("variable1")%></td>
    <td>&nbsp;</td>
    <td class="header"><%=request.getParameter("variable2")%></td>
    <td>&nbsp;</td>
    <td class="header"><%=request.getParameter("variable3")%></td>
    <td>&nbsp;</td>
    <td class="header"><%=request.getParameter("variable4")%></td>
    <td>&nbsp;</td>
    <td class="header"><%=request.getParameter("variable5")%></td>
    <td>&nbsp;</td>
    <td class="header"><%=request.getParameter("variable6")%></td>
    <td>&nbsp;</td>
    <td class="header"><%=request.getParameter("variable7")%></td>
    <td>&nbsp;</td>
  </tr>
</table>

 </body>
</html>