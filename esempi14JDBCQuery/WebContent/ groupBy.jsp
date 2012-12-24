<%@ page  language="java" import="java.sql.*" %>
<%
    Connection conn = null;
    
    Class.forName("com.mysql.jdbc.Driver").newInstance();
    String jdbcURL="jdbc:mysql://localhost:3306/jsp";
    conn = DriverManager.getConnection(jdbcURL,"root", "root");
    
    PreparedStatement psSelectRecord=null;
    ResultSet rsSelectRecord=null;
    String sqlSelectRecord=null;

    sqlSelectRecord ="SELECT count(*) as cnt, sStaffName, sStaffDept" +
                                 " FROM staff_register group by sStaffDept";
                           
    psSelectRecord=conn.prepareStatement(sqlSelectRecord);
    rsSelectRecord=psSelectRecord.executeQuery();
%>
<html>
<head>
<title>JDBC group by</title>
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
    <th>cnt</th>
    <th>sStaffName</th>
    <th>sStaffDept</th>
  </tr>
  <%
  int cnt=1;
  while(rsSelectRecord.next())
  {
  %>
  <tr>
    <td><%=rsSelectRecord.getString("cnt")%>&nbsp;</td>
    <td><%=rsSelectRecord.getString("sStaffName")%>&nbsp;</td>
    <td><%=rsSelectRecord.getString("sStaffDept")%>&nbsp;</td>
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