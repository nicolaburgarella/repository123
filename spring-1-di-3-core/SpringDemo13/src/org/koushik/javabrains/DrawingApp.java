package org.koushik.javabrains;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Triangle triangle = new Triangle();
		//BeanFactory factory= new XmlBeanFactory(new FileSystemResource("spring.xml"));
		//Triangle triangle = (Triangle)factory.getBean("triangle");
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); 
		//Triangle triangle = (Triangle)context.getBean("triangle");
		//triangle.draw();
		//Circle circle = (Circle)context.getBean("circle");
		//circle.draw();
		Shape shape = (Shape)context.getBean("circle");
		shape.draw();

	}

}
