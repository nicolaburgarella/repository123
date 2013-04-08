
<%@ page language="java"  errorPage="" %>
<html>
<head>
<title>Error Handling by try catch block in JSP</title>
</head>

<body>
<%
try{
 int a=0;
 int b=10;
 int c=b/a;
}
catch(Exception e)
{
  e.printStackTrace(); /// This will give detail information of error occur
  out.print("Error caught by Catch block is : "+e.getMessage());
}
%>
</body>
</html>