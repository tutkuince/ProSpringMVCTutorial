package io.spring.tutorial.part07.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import io.spring.tutorial.part07.config.DemoConfig;
import io.spring.tutorial.part07.service.TrafficFortuneService;

public class AroundDemoApp {
	public static void main(String[] args) {
		// read spring configuration java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

		// get the bean from the spring container
		TrafficFortuneService fortuneService = context.getBean("trafficFortuneService", TrafficFortuneService.class);
		
		System.out.println("\nMain Program: AroundDemoApp");
		
		System.out.println("Calling getFortune()");
		
		System.out.println("\nMy fortune is: " + fortuneService.getFortune());
		
		System.out.println("Finished!");

		// close the context
		context.close();
	}
}
