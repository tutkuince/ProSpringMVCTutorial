package io.spring.tutorial.part07.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import io.spring.tutorial.part07.config.DemoConfig;
import io.spring.tutorial.part07.dao.AccountDAOImpl;
import io.spring.tutorial.part07.dao.MembershipDAOImpl;
import io.spring.tutorial.part07.model.Account;

public class MainDemoApp {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// read spring config java calss
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

		// get the bean from spring container
		AccountDAOImpl accountDAO = context.getBean("accountDAOImpl", AccountDAOImpl.class);
		
		// get membership bean from spring container
		MembershipDAOImpl membershipDAO = context.getBean("membershipDAOImpl", MembershipDAOImpl.class);

		// call the business method
		accountDAO.addAccount(new Account(), true);
		accountDAO.doWork();
		
		// call the accountdao getter/setter methods
		accountDAO.setName("foobar");
		accountDAO.setServiceCode("silver");
		
		String name = accountDAO.getName();
		String code = accountDAO.getServiceCode();
		
		// call the membership business method
		membershipDAO.addMember();
		membershipDAO.goToSleep();

		// do it again
       //  System.out.println("\n let's call it again!\n");

		// call the business method again
		// accountDAO.addAccount();

		// close the context
		context.close();
	}
}
