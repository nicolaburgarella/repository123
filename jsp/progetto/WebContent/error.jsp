<%@ page  language="java" import="java.io.*" isErrorPage="true"  %>
<html>
<head>
<title>Implicit Exception Error page</title>
</head>

<body>
The Exception is <strong><%= exception.toString() %></strong><br>
Message : <strong><%=exception.getMessage()%></strong><br>

</body>
</html>