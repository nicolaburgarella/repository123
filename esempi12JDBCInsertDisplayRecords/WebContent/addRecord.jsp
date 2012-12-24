<%@ page  language="java" import="java.sql.*" errorPage="" %>
<html>
<head>
<title>Add new record into database in JSP</title>
</head>

<body>
<form name="frm" action="saveRecord.jsp">
<h1>Add New Record into Database</h1> <br>

Staff Name <input type="text" name="sStaffName"><br>
Staff Department <input type="text" name="sDept"><br>
Staff Phone <input type="text" name="sPhone"><br>
<input type="submit" name="submit" value=" Submit ">

</form>
</body>
</html>