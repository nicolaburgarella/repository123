<%@ page language="java" import="java.sql.*" errorPage="" %>
<%
        Connection conn = null;
        
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        String jdbcURL="jdbc:mysql://localhost:3306/jsp";
        conn = DriverManager.getConnection(jdbcURL,"root", "root");
        
        PreparedStatement psUpdateRecord=null;
        String sqlUpdateRecord=null;
        
        int empID=5;
        String staffName="yoh";
        int staffPhone=4; 
        //// if this come blank and aphla number it will throw
        /// parse int NumberFormatException exception, only number
        
        try
        {
            sqlUpdateRecord="update staff_register set sStaffName=?, iStaffPhone=? where iEmpID=?";
            psUpdateRecord=conn.prepareStatement(sqlUpdateRecord);
            psUpdateRecord.setString(1,staffName);
            psUpdateRecord.setInt(2,staffPhone);
            psUpdateRecord.setInt(3,empID);
            
            psUpdateRecord.executeUpdate();
        }
        catch(Exception e)
        {
          response.sendRedirect("updateRecord.jsp");
           //// On error it will send back to addRecord.jsp page
        }
        
        try{
          if(psUpdateRecord!=null)
          {
           psUpdateRecord.close();
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
<html>
<body>
  Data is updated successfully.
</body>
</html>