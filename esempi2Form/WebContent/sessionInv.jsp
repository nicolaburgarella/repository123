<%@ page contentType="text/html; charset=iso-8859-1" language="java" %>
<%
String checkboxAnswerInJSP=request.getParameter("answer");
boolean inv=false;

if(inv==true){
	session.invalidate();
}

%>
<html>
<body>

 <%
    if(checkboxAnswerInJSP.equals("si"))
    {
      out.print("La sessione corrente � stata invalidata");
      inv=true;
    }
    else
    {
      out.print("La sessione corrente � ancora valida");
    }
    %>


</body>
</html>