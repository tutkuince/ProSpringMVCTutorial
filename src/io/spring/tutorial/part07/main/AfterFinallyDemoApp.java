package io.spring.tutorial.part07.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import io.spring.tutorial.part07.config.DemoConfig;
import io.spring.tutorial.part07.dao.AccountDAOImpl;
import io.spring.tutorial.part07.model.Account;

public class AfterFinallyDemoApp {
	public static void main(String[] args) {
		// read spring configuration java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

		// get the bean from the spring container
		AccountDAOImpl accountDAO = context.getBean("accountDAOImpl", AccountDAOImpl.class);

		// call the method to find the accounts
		List<Account> accounts = null;

		try {
			// ad a boolean flag to simulate exceptions
			boolean tripWire = true;
			accounts = accountDAO.findAccounts(tripWire);
		} catch (Exception e) {
			System.out.println("\n\nMain Program . . . caught exception: " + e);
		}

		// display the accounts
		System.out.println("\nMain Program: AfterThrowingDemoApp");
		System.out.println("-----------");

		System.out.println(accounts);

		System.out.println("\n");

		// close the context
		context.close();
	}
}
