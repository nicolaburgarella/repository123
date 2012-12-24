<%@ page language="java" import="java.sql.*" errorPage="" %>
<%
        Connection conn = null;
        
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp","root", "root");
        
        PreparedStatement psDeleteRecord=null;
        String sqlDeleteRecord=null;
        
        
        try
        {
            sqlDeleteRecord="Delete from staff_register where iEmpID=2";
            psDeleteRecord=conn.prepareStatement(sqlDeleteRecord);
            
            psDeleteRecord.executeUpdate();
        }
        catch(Exception e)
        {
          response.sendRedirect("deleteRecord.jsp");
          //// On error it will send back to addRecord.jsp page
        }
        
        try{
          if(psDeleteRecord!=null)
          {
           psDeleteRecord.close();
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
Record is deleted successfully.
</body>
</html>