<%@ page language="java" errorPage="" %>
<html>
<head>
<title>Dynamic include in Action tags JSP</title>
</head>

<body>
<jsp:include page="header.jsp">
    <jsp:param name="variable1" value="Home" />
    <jsp:param name="variable2" value="Products" />
    <jsp:param name="variable3" value="Services" />
    <jsp:param name="variable4" value="Company Profile" />
    <jsp:param name="variable5" value="Register" />
    <jsp:param name="variable6" value="Login" />
    <jsp:param name="variable7" value="About Us" />
</jsp:include>
</body>
</html>