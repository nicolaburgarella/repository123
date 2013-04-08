<%@ page language="java" import="java.sql.*"%>
<html>
<head>
<title> Films Example: JSP, Postgres version</title>
</head>
<body bgcolor="white">
<%
        try {
 	    Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            out.println("<h1>Driver not found:" + e + e.getMessage() + "</h1>" );
        }
	try {
	    Connection conn = DriverManager.getConnection (
	    	"jdbc:postgresql://127.0.0.1:8080/geonetwork264",
		"postgres", "postgres" );

            Statement stmt = conn.createStatement();
            ResultSet rs;

            rs = stmt.executeQuery("SELECT id FROM metadata");
	    out.println( "<table border=1>" );
            while ( rs.next() ) {
                String id = rs.getString("id");
                //String director = rs.getString("director");
                //String origin = rs.getString("origin");
                //String made = rs.getString("made");
                //String length = rs.getString("length");
                out.println("<tr><td>"+id+"</td><td>" );
            }
	    out.println( "</table>" );

            conn.close();
        } catch (Exception e) {
            out.println( "<h1>exception: "+e+e.getMessage()+"</h1>" );
        }
%>
</body>
</html>
