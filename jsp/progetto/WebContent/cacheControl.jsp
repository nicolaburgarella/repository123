<%@ page language="java" %>
<%
response.setHeader("Cache-Control","no-cache"); 
/*--This is used for HTTP 1.1 --*/
response.setHeader("Pragma","no-cache");
 /*--This is used for HTTP 1.0 --*/
response.setDateHeader ("Expires", 0); 
/*---- This is used to prevents caching at the proxy server */
%>
<html>
<head>
<title>Response object in cache controlling</title>
</head>

<body>
This is no cache, Can test this page by open this page on browser and
 then open any other website after press back button on browser,
 if cacheControl.jsp is reload, it means it is not cached
</body>
</html>