package org.koushik.javabrains.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
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
	
	//@Before("args(name)")
	//@After("args(name)")
	@AfterReturning(pointcut="args(name)", returning="returnString")
	public void stringArgumentMethod(String name, String returnString){
		System.out.println("A method that takes String arguments has been called. The value is "+name+" The output value is"+returnString);
	}
	
	@AfterThrowing(pointcut="args(name)", throwing="ex")
	public void exceptionAdvice(String name, RuntimeException ex){
		System.out.println("An exception has been thrown "+ ex);
	}
	
	
	@Pointcut("execution(* get*())")
	public void allGetters(){}
	
	
	//@Pointcut("execution(* * org.koushik.javabrains.model.Circle.*(..))")
	@Pointcut("within(org.koushik.javabrains.model.Circle)")
	public void allCircleMethods(){} 
	
	
	@Around("allGetters()")
	public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
		
		Object returnValue= null;
		
		try {
			System.out.println("Before Advice");
			returnValue=proceedingJoinPoint.proceed();
			System.out.println("After Returning");
			
		} catch (Throwable e) {
			System.out.println("After Throwing");
		}
		
		System.out.println("After Finally");
		return returnValue;
		
	}
	

}
