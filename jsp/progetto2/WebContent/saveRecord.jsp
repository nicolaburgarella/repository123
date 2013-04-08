<%@ page language="java" import="java.sql.*" errorPage="" %>
<%
  Connection conn = null;
        
  Class.forName("com.mysql.jdbc.Driver").newInstance();
  conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp","root", "root");
        
  PreparedStatement psInsertRecord=null;
  String sqlInsertRecord=null;
        
  String staffName=request.getParameter("sStaffName");
  String staffDept=request.getParameter("sDept");
  int staffPhone=Integer.parseInt(request.getParameter("sPhone"));
         //// if this come blank and alpha number it will throw parse int 
            //NumberFormatException exception, only number
            
        
  try
  {
   sqlInsertRecord="insert into staff_register (sStaffName, sStaffDept, iStaffPhone) values(?,?,?)";
   psInsertRecord=conn.prepareStatement(sqlInsertRecord);
   psInsertRecord.setString(1,staffName);
   psInsertRecord.setString(2,staffDept);
   psInsertRecord.setInt(3,staffPhone);
            
   psInsertRecord.executeUpdate();
  }
  catch(Exception e)
  {
      response.sendRedirect("addRecord.jsp");//// On error it will send back to addRecord.jsp page
  }
        
    try{
      if(psInsertRecord!=null)
      {
       psInsertRecord.close();
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
