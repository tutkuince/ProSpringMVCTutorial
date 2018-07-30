package io.spring.tutorial.part07.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import io.spring.tutorial.part07.config.DemoConfig;
import io.spring.tutorial.part07.dao.AccountDAO;
import io.spring.tutorial.part07.dao.AccountDAOImpl;

public class MainDemoApp {
	public static void main(String[] args) {
		// read spring config java calss
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

		// get the bean from spring container
		AccountDAO accountDAO = context.getBean("accountDAOImpl", AccountDAOImpl.class);

		// call the business method
		accountDAO.addAccount();

		// do it again
		System.out.println("\n let's call it again!\n");

		// call the business method again
		accountDAO.addAccount();

		// close the context
		context.close();
	}
}