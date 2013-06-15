<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%
String userName = request.getParameter("name");

if(userName != null){
	session.setAttribute("sessionUsername", userName);
	//application.setAttribute("applicationUsername", userName);
	pageContext.setAttribute("pageContextUsername", userName);
	pageContext.setAttribute("applicationUsername", userName, pageContext.APPLICATION_SCOPE);
	pageContext.findAttribute(arg0);
}

%>
<br>
The user name in the request object is <%=userName %>
<br>
The user name in the session object is <%=session.getAttribute("sessionUsername") %>
<br>
The user name in the application object is <%=application.getAttribute("applicationUserName") %>  
<br>
The user name in the page application object is <%=pageContext.getAttribute("pageContextUserName") %>  
<br>
</body>
</html>