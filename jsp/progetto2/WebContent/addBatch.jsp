<%@ page language="java" import="java.sql.*" errorPage="" %>
<%
        Connection conn = null;
        
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        String jdbcURL="jdbc:mysql://localhost:3306/jsp";
        
        conn = DriverManager.getConnection(jdbcURL,"root", "root");
        
        PreparedStatement psInsertRecord=null;
        String sqlInsertRecord=null;
        int[] iNoRows=null;
%>
<html>
<head>
<title>Add Batch in JDBC</title>
</head>

<body>
<%
sqlInsertRecord="insert into class_room (sStudentName, sRollNo, sCourse) values(?,?,?)";
    psInsertRecord=conn.prepareStatement(sqlInsertRecord);
    
    for(int i=1;i<=50;i++)
    {
      psInsertRecord.setString(1,"New Student");
      psInsertRecord.setString(2,"4"+i);
      psInsertRecord.setString(3,"10th Class");
      psInsertRecord.addBatch(); 
    }
    iNoRows=psInsertRecord.executeBatch();
%>
Row inserted into table is <b> <%=iNoRows.length%></b> 
</body>
</html>
<%
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
