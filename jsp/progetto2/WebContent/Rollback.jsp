<%@ page language="java" import="java.sql.*" errorPage="" %>
<%
        Connection conn = null;
        
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        String jdbcURL="jdbc:mysql://localhost:3306/jsp";
    
        conn = DriverManager.getConnection(jdbcURL,"root", "root");
        
        Statement stInsertRecord=null;
        String sqlInsertRecord=null;
%>
<html>
<head>
<title>Rollback transaction JDBC</title>
</head>

<body>
<%
stInsertRecord=conn.createStatement();
conn.setAutoCommit(false);
    try{
        for(int i=1;i<=50;i++)
        {
          sqlInsertRecord="insert into class_room (sStudentName, sRollNo, sCourse)" +
                                      " values('New Student','4"+i+"','10th Class')";
          stInsertRecord.executeUpdate(sqlInsertRecord);
        }
        conn.commit();
       }
    catch(Exception e)
    {
      e.printStackTrace();
      conn.rollback(); 
    }
    finally
    {
      conn.setAutoCommit(true);
    }
%>
Rollback transaction is done successfully
</body>
</html>
<%
       try{
          if(stInsertRecord!=null)
          {
            stInsertRecord.close();
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
