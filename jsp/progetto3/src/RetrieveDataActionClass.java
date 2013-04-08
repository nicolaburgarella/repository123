    public ActionForward execute(parameters)  
    {  
    List list=new ArrayList();  
    String key="success";  
    Statement stmt = null;  
    ResultSet rs=null;  
      
    Connection conn=DBUtil.getDBConnection();  
    String query="select * from student_info";  
    st = conn.createStatement();  
    rs = stmt.executeQuery(query);    
    List newList = new ArrayList();  
    while (rs.next())   
    {    
    list = new ArrayList();//Initializing values List for every loop  
    list.add(rs.getString("name"));  
    list.add(rs.getString("phone"));  
    list.add(rs.getString("email"));  
    list.add(rs.getString("city"));  
    list.add(rs.getString("state"));  
    list.add(rs.getString("gender"));  
    list.add(rs.getString("branch"));  
    newList.add(list);//Added to new list  
    //HttpSession session=request.getSession();  
    //session.setAttribute("listname",list);  
    list = null;  
    }  
    request.setAttribute("listname",newList);//Added to Request Attribute.  
    return mapping.findForward(key);  
    }  
    }  