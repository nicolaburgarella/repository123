<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h3>Testing JSPs</h3>

<%!
public int add (int a, int b){
	return a+b;
}

%>

<% 
int i=1;
int j=2;

int k= i+j;

//out.println("Value of K is "+k);
%>

Value of K is <%= k %>


<%
k=add(3245235,2143242);
%>

<br>

Value of K is <%=k %>

<%
for(i=0; i<5; i++){ %>
	
<!-- out.println("<br> i =" +i);  -->
	
<br> The new value of i= <%=i%>
	
<%} %>


<!-- è lo stesso che facevo con la servlet con:
int i=1;
int j=2;
int k;
PrintWriter out = response.getWriter();
out.println("Value of K is" +k);
 -->
</body>
</html>