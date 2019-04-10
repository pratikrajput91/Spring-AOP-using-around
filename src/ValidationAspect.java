package com.capgemini.spring.math.aspect;
import com.capgemini.spring.math.*;
import org.springframework.stereotype.Component;
import org.aspectj.lang.*;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Around;




@Component
@Aspect
public class ValidationAspect {
	@Around("execution(* com.capgemini.spring.math.impl.CalculatorImpl.add(..))")
	public void printAdd(ProceedingJoinPoint pjp) throws Throwable{
	Object[] args = pjp.getArgs();
	int number1=Integer.parseInt(args[0].toString());
	int number2=Integer.parseInt(args[1].toString());
	System.out.println("addition aspect done");
	if(number1>0 && number2>0) 
	pjp.proceed();
	else
	
	System.out.println("number should be greater than zero");
	
}
@Around("execution(* com.capgemini.spring.math.impl.CalculatorImpl.divide(..))")
public void printDivide(ProceedingJoinPoint pjp) throws Throwable {
	Object[] args = pjp.getArgs();
	double number1=Double.parseDouble(args[0].toString());
	double number2=Double.parseDouble(args[1].toString());
	System.out.println("division aspect done");
	if(number2!=0) 
	
	pjp.proceed();
	else
	
	System.out.println("denominator should not be zero");
}
}
	