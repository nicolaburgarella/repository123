<%@ page  language="java" import="java.sql.*" errorPage="" %>
<%
        Connection conn = null;
        
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp","root", "root");
        
        PreparedStatement psSelectRecord=null;
        ResultSet rsSelectRecord=null;
        
        String sqlSelectRecord=null;
        
        int empID=0;
        String staffName=null;
        String staffDept=null;
        int staffPhone=0; 
        
        sqlSelectRecord = "select iEmpID, sStaffName, sStaffDept, iStaffPhone from staff_register";
        psSelectRecord=conn.prepareStatement(sqlSelectRecord);
        rsSelectRecord=psSelectRecord.executeQuery();
        if(rsSelectRecord.next())
        {
            staffName=rsSelectRecord.getString("sStaffName");
            staffDept=rsSelectRecord.getString("sStaffDept");
            staffPhone=rsSelectRecord.getInt("iStaffPhone");
            empID=rsSelectRecord.getInt("iEmpID");
        }
        
%>

<html>
<head>
<title>Delete record into database in JSP</title>
</head>

<body>
<form name="frm" action="saveDeleteRecord.jsp">
<input type="hidden" name="EmpID" value="<%=empID%>">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td width="33%">&nbsp;</td>
    <td width="25%">&nbsp;</td>
    <td width="42%">&nbsp;</td>
  </tr>
  <tr>
    <td colspan="3" align="center">Delete  Record from Database</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>Staff Name</td>
    <td><input type="text" name="sStaffName" value="<%=staffName%>"></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>Staff Department</td>
    <td><input type="text" name="sDept" value="<%=staffDept%>"></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>Staff Phone</td>
    <td><input type="text" name="sPhone" value="<%=staffPhone%>"></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td><input type="submit" name="submit" value=" Submit "></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
</table>
</form>
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
