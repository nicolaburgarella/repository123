<%@ page language="java" import="java.sql.*" %>
<html>
<head>
<title>For loop in JSP</title>
</head>

<body>
<%
for(int i=0;i<=10;i++)
{
  out.print("Loop through JSP count :"+i+"<br/>");
}
%>
<br>
<%
int i=0;
while(i<=10)
{
  out.print("While Loop through JSP count :"+i+"<br/>");
  i++; 
}
%>
<br>
<%
int j=0;
do{
  out.print("While Loop through JSP count :"+j+"<br/>");
  j++; 
}
while(j<=10);
%>
</body>
</html>