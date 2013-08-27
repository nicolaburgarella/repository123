package org.koushik.javabrains;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape, ApplicationEventPublisherAware{

	private Point center;
	
	private ApplicationEventPublisher publisher;
	
	@Autowired
	private MessageSource Messagesource;

	public void setMessagesource(MessageSource messagesource) {
		Messagesource = messagesource;
	}

	public Point getCenter() {
		return center;
	}

	@Resource(name="pointC")
	public void setCenter(Point center) {
		this.center = center;
	}


	@Override
	public void draw() {
		//System.out.println("Drawing Circle");
		//System.out.println("Circle: Point is: ( "+center.getX()+" , "+center.getY()+" )");
		//System.out.println(this.Messagesource.getMessage("greeting", null, "Default greeting", null));
		System.out.println(this.Messagesource.getMessage("drawing.circle", null, "Default drawing message", null));
		System.out.println(this.Messagesource.getMessage("drawing.point", new Object[]{center.getX(),center.getY()}, "Default point message", null));
		DrawEvent drawEvent = new DrawEvent(this);
		publisher.publishEvent(drawEvent);
		
		
	}
	
	
	@PostConstruct
	public void initializeCircle(){
		System.out.println("Init of Circle");
	}
	
	@PreDestroy
	public void destroyCircle(){
		System.out.println("Destroy of Circle");
		
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
		
	}

}
