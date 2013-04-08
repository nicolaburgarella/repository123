<%@ page language="java" import="java.sql.*" errorPage="" %>
<%
        Connection conn = null;
        
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp","root", "root");
        
        PreparedStatement psDeleteRecord=null;
        String sqlDeleteRecord=null;
        
        int empID=Integer.parseInt(request.getParameter("EmpID"));
        
        try
        {
            sqlDeleteRecord="Delete from staff_register where iEmpID=?";
            psDeleteRecord=conn.prepareStatement(sqlDeleteRecord);
            psDeleteRecord.setInt(1,empID);
            
            psDeleteRecord.executeUpdate();
        }
        catch(Exception e)
        {
          response.sendRedirect("deleteRecord1.jsp");
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
Data is saved successfully.
</body>
</html>