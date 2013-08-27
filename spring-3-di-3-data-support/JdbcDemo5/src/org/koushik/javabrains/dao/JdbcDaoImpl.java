package org.koushik.javabrains.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.apache.derby.client.am.PreparedStatement;
import org.koushik.javabrains.model.Circle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class JdbcDaoImpl {
	
	
	//@Autowired
	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplate;
	
	
	

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


/*metodo obsoleto con jdbc senza usare spring djbctemplate
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
		
	}*/
	
	/* metodi che usano spring jdbctemplate che ritornano un intero, una stringa, un oggetto, una lista di oggetti*/
	
	public int getCircleCount(){
		String sql="SELECT COUNT(*) FROM CIRCLE";
		//jdbcTemplate.setDataSource(getDatasource());
		return jdbcTemplate.queryForInt(sql);
	}
	
	
	public String getCircleName(int circleId){
		String sql="SELECT NAME FROM CIRCLE WHERE ID= ?";
		return jdbcTemplate.queryForObject(sql, new Object[] {circleId},  String.class);
		
	}
	
	public Circle getCircleForId(int circleId){
		String sql="SELECT * FROM CIRCLE WHERE ID=?";
		return jdbcTemplate.queryForObject(sql, new Object[] {circleId},  new CircleMapper());	
	}		
	
	
	public List<Circle> getAllCircles(){
		String sql="SELECT * FROM CIRCLE";
		return jdbcTemplate.query(sql, new CircleMapper());
		
	}
	
	public void insertCircle(Circle circle){
		String sql="INSERT INTO CIRCLE (ID, NAME) VALUES (?, ?)";
		jdbcTemplate.update(sql, new Object[]{circle.getId(), circle.getName()});
	}
	
	
	public void createTriangleTable(){
	String sql ="CREATE TABLE TRIANGLE (ID INTEGER, NAME VARCHAR(50))";	
	jdbcTemplate.execute(sql);
	}
	
		
	}


final class CircleMapper implements RowMapper<Circle>{

	@Override
	public Circle mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		Circle circle = new Circle();
		circle.setId(resultSet.getInt("ID"));
		circle.setName(resultSet.getString("NAME"));
		return circle;
	}
	
	
}
