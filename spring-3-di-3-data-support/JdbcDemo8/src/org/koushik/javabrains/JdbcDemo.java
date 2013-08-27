package org.koushik.javabrains;

import org.koushik.javabrains.dao.HibernateDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ApplicationContext cxt = new ClassPathXmlApplicationContext("spring.xml");
		HibernateDaoImpl dao = cxt.getBean("hibernateDaoImpl", HibernateDaoImpl.class);
		System.out.println(dao.getCircleCount());


	}

}
