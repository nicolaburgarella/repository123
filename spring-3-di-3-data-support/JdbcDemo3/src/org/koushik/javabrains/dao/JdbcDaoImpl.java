package org.koushik.javabrains.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;


import org.apache.derby.client.am.PreparedStatement;
import org.koushik.javabrains.model.Circle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class JdbcDaoImpl {
	
	
	//@Autowired
	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplate = new JdbcTemplate();
	
	
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}



	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}



	public DataSource getDatasource() {
		return dataSource;
	}



	@Autowired
	public void setDatasource(DataSource datasource) {
		//this.dataSource = datasource;
		this.jdbcTemplate = new JdbcTemplate(datasource);
	}



	public Circle getCircle(int circleId){
		
		Connection conn=null;
		
		try{
		
		
			//String driver ="org.apache.derby.jdbc.ClientDriver";
			//Class.forName(driver).newInstance();
			conn=dataSource.getConnection();
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
	
	
	public int getCircleCount(){
		String sql="SELECT COUNT(*) FROM CIRCLE";
		//jdbcTemplate.setDataSource(getDatasource());
		return jdbcTemplate.queryForInt(sql);
	}
	
}
