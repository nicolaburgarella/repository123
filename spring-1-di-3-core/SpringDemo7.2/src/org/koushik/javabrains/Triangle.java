package org.koushik.javabrains;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle {
	
	private List <Point> points;
	
	public List<Point> getPoints() {
		return points;
	}



	public void setPoints(List<Point> points) {
		this.points = points;
	}


	public void draw(){
		for(Point point:points){
			System.out.println("Point = ("+point.getX()+", "+point.getY()+")");
		}
	}

}
