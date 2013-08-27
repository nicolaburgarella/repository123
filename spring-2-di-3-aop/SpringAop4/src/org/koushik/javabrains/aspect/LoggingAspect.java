package org.koushik.javabrains.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.koushik.javabrains.model.Circle;

@Aspect
public class LoggingAspect {
	
	@Before("allCircleMethods() ")
	public void LoggingAdvice(JoinPoint joinPoint){
		
	}
	
	/*
	@Before("args(String)")
	public void stringArgumentMethod(){
		System.out.println("A method that takes String arguments has been called.");
	}
	*/
	
	@Before("args(name)")
	public void stringArgumentMethod(String name){
		System.out.println("A method that takes String arguments has been called. The value is "+name);
	}
	
	@Pointcut("execution(* get*())")
	public void allGetters(){}
	
	
	//@Pointcut("execution(* * org.koushik.javabrains.model.Circle.*(..))")
	@Pointcut("within(org.koushik.javabrains.model.Circle)")
	public void allCircleMethods(){} 

}
