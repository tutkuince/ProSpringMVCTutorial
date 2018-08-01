package io.spring.tutorial.part07.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import io.spring.tutorial.part07.config.DemoConfig;
import io.spring.tutorial.part07.dao.AccountDAOImpl;
import io.spring.tutorial.part07.model.Account;

public class AfterReturningDemoApp {
	public static void main(String[] args) {
		// read spring configuration java class 
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		// get the bean from the spring container
		AccountDAOImpl accountDAO = context.getBean("accountDAOImpl", AccountDAOImpl.class);
		
		// call the method to find the accounts
		List<Account> accounts = accountDAO.findAccounts();
		
		// display the accounts
		System.out.println("\nMain Program: AfterReturningDemoApp");
		System.out.println("-----------");
		
		System.out.println(accounts);
		
		System.out.println("\n");
		
		// close the context
		context.close();
	}
}
