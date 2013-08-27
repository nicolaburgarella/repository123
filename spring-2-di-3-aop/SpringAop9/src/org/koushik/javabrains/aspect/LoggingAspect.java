package org.koushik.javabrains.aspect;

import org.aspectj.lang.ProceedingJoinPoint;


public class LoggingAspect {
	

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
	
	public void loggingAdvice(){
		System.out.println("logging from the advice");
	}
	

}
