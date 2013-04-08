<%@ page  language="java" import="java.sql.*" %>
<%
    Connection conn = null;
    
    Class.forName("org.postgresql.Driver").newInstance();
    String jdbcURL="jdbc:postgresql://localhost:5432/geonetwork264";
    conn = DriverManager.getConnection(jdbcURL,"postgres", "postgres");
    
    PreparedStatement psSelectRecord=null;
    ResultSet rsSelectRecord=null;
    String sqlSelectRecord=null;

     sqlSelectRecord="SELECT id,uuid,data from metadata where id=1";
                           
    psSelectRecord=conn.prepareStatement(sqlSelectRecord);
    rsSelectRecord=psSelectRecord.executeQuery();
 
%>
<html>
<head>
<title>SubQuery  in JDBC Query</title>
</head>

<body>
  <%
  int cnt=1;
  while(rsSelectRecord.next())
  {
  %>
  
    <%=rsSelectRecord.getString("id")%> <br>
	<%=rsSelectRecord.getString("uuid")%> <br><br>
	
	Data:<br><pre>
	<%=rsSelectRecord.getString("data")%></pre>
	
  <%
   cnt++;   /// increment of counter
  } /// End of while loop
  %>
</table>

</body>
</html>
<%
try{
          if(psSelectRecord!=null)
          {
            psSelectRecord.close();
          }
          if(rsSelectRecord!=null)
          {
            rsSelectRecord.close();
          }
          
          
          if(conn!=null)
          {
           conn.close();
          }
        }
        catch(Exception e)
        {
          e.printStackTrace(); 
        }
%>




