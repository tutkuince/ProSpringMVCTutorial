package io.spring.tutorial.part07.main;

import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import io.spring.tutorial.part07.config.DemoConfig;
import io.spring.tutorial.part07.service.TrafficFortuneService;

public class AroundWithLoggerDemoApp {

	private static Logger logger = Logger.getLogger(AroundWithLoggerDemoApp.class.getName());

	public static void main(String[] args) {
		// read spring configuration java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

		// get the bean from the spring container
		TrafficFortuneService fortuneService = context.getBean("trafficFortuneService", TrafficFortuneService.class);

		logger.info("\nMain Program: AroundDemoApp");	// System.out.println("\nMain Program: AroundDemoApp");

		logger.info("Calling getFortune()");

		logger.info("\nMy fortune is: " + fortuneService.getFortune());

		logger.info("Finished!");

		// close the context
		context.close();
	}
}
