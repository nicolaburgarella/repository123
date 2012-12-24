<%@ page  language="java" errorPage="" %>
<%!
         public String nullconv(String str)
         {    
            if(str==null)
                str="";
            else if(str.equals("null"))
                str="";
            else if((str.trim()).equals(""))
                str="";
            else if(str.equals(null))
                str="";
            else
                str=str.trim();
            return str;
         }

%>

<%
 String myVariable=null;
%>
<html>
<head>
<title>Declaration in JSP</title>
</head>

<body>
This is null variable : <%=nullconv(myVariable)%>
</body>
</html>