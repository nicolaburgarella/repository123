package org.koushik.javabrains.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.derby.client.am.PreparedStatement;
import org.koushik.javabrains.model.Circle;

public class JdbcDaoImpl {

	public Circle getCircle(int circleId){
		
		Connection conn=null;
		
		try{
		
		String driver ="org.apache.derby.jdbc.ClientDriver";
		
			Class.forName(driver).newInstance();
			conn=DriverManager.getConnection("jdbc:derby://localhost:1527/db");
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement("SELECT * from circle where id=?");
			ps.setInt(1, circleId);
			
			Circle circle= null;
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()){
				circle= new Circle(circleId, rs.getString("name"));
			}
			
			rs.close();
			ps.close();
			
			return circle;
			
		}catch(Exception e){
			throw(new RuntimeException());
		}

		finally{
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
