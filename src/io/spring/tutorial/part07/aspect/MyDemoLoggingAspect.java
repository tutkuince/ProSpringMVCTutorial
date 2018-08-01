package io.spring.tutorial.part07.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	// this is where we add all of our related advices for logging

	// let's start with an @Before advice

	
	
	// @Before("execution(public void io.spring.tutorial.part07.dao.AccountDAOImpl.addAccount())")
	
	//@Before("execution(public void add*())")	// any match start with add...
	
	// @Before("execution(public * add*())")	// any match starts with add and return type
	
	// @Before("execution(* add*(io.spring.tutorial.part07.model.Account))")	// must use fully qualified class name
	
	// @Before("execution(* add*(. .))")	// match on any number of parameters
	
	// @Before("execution(* add*(io.spring.tutorial.part07.model.Account, . .))")
	
	// @Before("execution(* io.spring.tutorial.part07.dao.*.*(..))")	// match method in a package -> match on dao.AnyClass.AnyMethod
	
	@Pointcut("execution(* io.spring.tutorial.part07.dao.*.*(..))")
	private void forDaoPackage() {}
	
	@Before("forDaoPackage()")
	public void beforeAddAccountAdvice() {
		System.out.println("\n======>>> Executing @Before advice on addAccount()");
	}
	
	@Before("forDaoPackage()")	// reuse of pointcut expression declaration
	public void performApiAnalytics() {
		System.out.println("\n======>>> Performing API analytics");
	}
	
	
}
