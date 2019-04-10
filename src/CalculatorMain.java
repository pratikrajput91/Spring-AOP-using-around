package com.capgemini.spring.math.main;
import org.springframework.stereotype.Component;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.capgemini.spring.math.*;
public class CalculatorMain {
public static void main (String args[]) {

	ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
	Calculator calculator = context.getBean(Calculator.class);

	calculator.add(10,-20);
	calculator.divide(10.0,0.0);
}
}
	