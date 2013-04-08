<%@ page language="java" import="java.sql.*" errorPage="" %>
<%
        Connection conn = null;
        
        Class.forName("org.postgresql.Driver").newInstance();
        String jdbcURL="jdbc:postgresql://127.0.0.1:8080/geonetwork264";
        conn = DriverManager.getConnection(jdbcURL,"postgres", "postgres");
        
        PreparedStatement psSelectRecord=null;
        ResultSet rsSelectRecord=null;
        String sqlSelectRecord=null;
   
        sqlSelectRecord ="SELECT id,uuid,createdate,changedate FROM metadata";
        psSelectRecord=conn.prepareStatement(sqlSelectRecord);
        rsSelectRecord=psSelectRecord.executeQuery();
 
%>
<html>
<head>
<title>View records in JSP through database</title>
<style>
td
{
text-align:center
}
</style>
</head>

<body>
<h1>View Record from Database through JSP</h1>

S. No |  EmpID | Staff Name | Staff Department | Staff Phone <br>
 
  <%
  int cnt=1;
  while(rsSelectRecord.next())
  {
  %>
   <%=cnt%>
   <%=rsSelectRecord.getString("id")%> 
   <%=rsSelectRecord.getString("uuid")%> 
   <%=rsSelectRecord.getString("createdate")%> 
   <%=rsSelectRecord.getString("changedate")%>
   
  <br>
  <%
   cnt++;   /// increment of counter
  } /// End of while loop
  %>

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
