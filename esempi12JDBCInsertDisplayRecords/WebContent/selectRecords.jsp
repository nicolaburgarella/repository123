<%@ page language="java" import="java.sql.*" errorPage="" %>
<%
        Connection conn = null;
        
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        String jdbcURL="jdbc:mysql://localhost:3306/jsp";
        conn = DriverManager.getConnection(jdbcURL,"root", "root");
        
        PreparedStatement psSelectRecord=null;
        ResultSet rsSelectRecord=null;
        String sqlSelectRecord=null;
   
        sqlSelectRecord ="SELECT * FROM staff_register";
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
   <%=rsSelectRecord.getString("iEmpID")%> 
   <%=rsSelectRecord.getString("sStaffName")%> 
   <%=rsSelectRecord.getString("sStaffDept")%> 
   <%=rsSelectRecord.getString("iStaffPhone")%>
   
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
