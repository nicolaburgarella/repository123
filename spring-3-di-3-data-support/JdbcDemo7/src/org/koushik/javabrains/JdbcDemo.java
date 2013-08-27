package org.koushik.javabrains;

import org.koushik.javabrains.dao.JdbcDaoImpl;
import org.koushik.javabrains.dao.SimpleJdbcDaoImpl;
import org.koushik.javabrains.model.Circle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ApplicationContext cxt = new ClassPathXmlApplicationContext("spring.xml");
		SimpleJdbcDaoImpl dao = cxt.getBean("simpleJdbcDaoImpl", SimpleJdbcDaoImpl.class);
		System.out.println(dao.getCircleCount());


	}

}
