<%@ page  language="java" import="java.sql.*" %>
<%
        Connection conn = null;
        
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        String jdbcURL="jdbc:mysql://localhost:3306/jsp";
        conn = DriverManager.getConnection(jdbcURL,"root", "root");
        
        PreparedStatement psSelectRecord=null;
        ResultSet rsSelectRecord=null;
        String sqlSelectRecord=null;
   
        sqlSelectRecord ="SELECT * FROM staff_register where sStaffDept=?";
        psSelectRecord=conn.prepareStatement(sqlSelectRecord);
        psSelectRecord.setString(1,"Marketing");
        rsSelectRecord=psSelectRecord.executeQuery();
 
%>
<html>
<head>
<title>where clause in JDBC Query</title>
<style>
th
{
 text-align:left;
 padding-left:5px;
}
td
{
 text-align:left;
 padding-left:5px;
}
</style>
</head>

<body>
<table width="100%" border="1" cellspacing="0" cellpadding="0">
  <tr>
    <th>iEmpID</th>
    <th>sStaffName </th>
    <th>sStaffDept</th>
    <th>iStaffPhone</th>
  </tr>
  <%
  int cnt=1;
  while(rsSelectRecord.next())
  {
  %>
  <tr>
    <td><%=rsSelectRecord.getString("iEmpID")%>&nbsp;</td>
    <td><%=rsSelectRecord.getString("sStaffName")%>&nbsp;</td>
    <td><%=rsSelectRecord.getString("sStaffDept")%>&nbsp;</td>
    <td><%=rsSelectRecord.getString("iStaffPhone")%>&nbsp;</td>
  </tr>
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