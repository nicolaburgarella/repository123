package org.koushik.javabrains;

import org.koushik.javabrains.dao.JdbcDaoImpl;
import org.koushik.javabrains.model.Circle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ApplicationContext cxt = new ClassPathXmlApplicationContext("spring.xml");
		JdbcDaoImpl dao = cxt.getBean("jdbcDaoImpl", JdbcDaoImpl.class);
		//Circle circle = dao.getCircle(1);
		//System.out.println(circle.getName());
		//System.out.println(dao.getCircleCount()); 
		//System.out.println(dao.getCircleForId(1).getName());
		//dao.insertCircle(new Circle(3, "Third Circle"));
		//System.out.println(dao.getAllCircles().size());
		dao.createTriangleTable();

	}

}
