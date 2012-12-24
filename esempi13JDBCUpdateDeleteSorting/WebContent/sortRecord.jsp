<%@ page language="java" import="java.sql.*" errorPage="" %>
<%
    Connection conn = null;
    
    Class.forName("com.mysql.jdbc.Driver").newInstance();
    String jdbcURL="jdbc:mysql://localhost:3306/jsp";
    
    conn = DriverManager.getConnection(jdbcURL,"root", "root");
    
    PreparedStatement psSelectRecord=null;
    ResultSet rsSelectRecord=null;
    String sqlSelectRecord=null;

    sqlSelectRecord ="SELECT * FROM staff_register order by sStaffName desc"; 
    /// Descending order 
    
    ////  sqlSelectRecord ="SELECT * FROM staff_register order by sStaffName asc"; 
    /// ascending order 
    
    psSelectRecord=conn.prepareStatement(sqlSelectRecord);
    rsSelectRecord=psSelectRecord.executeQuery();
        

%>

<html>
<head>
<title>Display records with sorting in JSP through database</title>
<style>
td
{
text-align:center
}
</style>
</head>

<body>
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td width="12%">&nbsp;</td>
    <td width="16%">&nbsp;</td>
    <td width="24%">&nbsp;</td>
    <td width="22%">&nbsp;</td>
    <td width="26%">&nbsp;</td>
  </tr>
  <tr>
    <td colspan="5" align="center">View Record from Database through JSP </td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <th>S. No </th>
    <th>EmpID</th>
    <th>Staff Name </th>
    <th>Staff Department </th>
    <th>Staff Phone </th>
  </tr>
  <%
  int cnt=1;
  while(rsSelectRecord.next())
  {
  %>
  <tr>
    <td><%=cnt%></td>
    <td><%=rsSelectRecord.getString("iEmpID")%>&nbsp;</td>
    <td><%=rsSelectRecord.getString("sStaffName")%>&nbsp;</td>
    <td><%=rsSelectRecord.getString("sStaffDept")%>&nbsp;</td>
    <td><%=rsSelectRecord.getString("iStaffPhone")%>&nbsp;</td>
  </tr>
  <%
   cnt++;   /// increment of counter
  } /// End of while loop
  %>
  
  <tr>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
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