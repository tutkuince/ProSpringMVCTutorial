package io.spring.tutorial.part07.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
//import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import io.spring.tutorial.part07.model.Account;

@Aspect
@Component
@Order(1)
public class MyDemoLoggingAspect {

	// this is where we add all of our related advices for logging

	// let's start with an @Before advice

	
	// @Before("execution(public void
	// io.spring.tutorial.part07.dao.AccountDAOImpl.addAccount())")

	// @Before("execution(public void add*())") // any match start with add...

	// @Before("execution(public * add*())") // any match starts with add and return
	// type

	// @Before("execution(* add*(io.spring.tutorial.part07.model.Account))") // must
	// use fully qualified class name

	// @Before("execution(* add*(. .))") // match on any number of parameters

	// @Before("execution(* add*(io.spring.tutorial.part07.model.Account, . .))")

	// @Before("execution(* io.spring.tutorial.part07.dao.*.*(..))") // match method
	// in a package -> match on dao.AnyClass.AnyMethod

//	@Pointcut("execution(* io.spring.tutorial.part07.dao.*.*(..))")
//	private void forDaoPackage() {}

	@Before("io.spring.tutorial.part07.aspect.AOPExpressions.forDaoPackageNoGetterSetter()")
	public void beforeAddAccountAdvice(JoinPoint joinPoint) { // Get the method signature and arguments
		System.out.println("\n======>>> Executing @Before advice on addAccount()");

		// display the method signature
		MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
		System.out.println("Method: " + methodSignature);

		// display the method arguments
		// get arguments
		Object[] args = joinPoint.getArgs();

		// loop thru arguments
		for (Object object : args) {
			System.out.println(object);

			if (object instanceof Account) {

				// downcast and print Account specific stuff
				Account account = (Account) object;

				System.out.println("Account name: " + account.getName());
				System.out.println("Account level: " + account.getLevel());
			}
		}
	}

//	@Before("forDaoPackageNoGetterSetter()")	// reuse of pointcut expression declaration
//	public void performApiAnalytics() {
//		System.out.println("\n======>>> Performing API analytics");
//	}
//	
//	@Before("forDaoPackageNoGetterSetter()")
//	public void logToCloudAsync() {
//		System.out.println("\n======>>> Logging to Cloud in async fashion");
//	}

//	// create pointcut for getter methods
//	@Pointcut("execution(* io.spring.tutorial.part07.dao.*.get*(..))")
//	public void getter() {
//		System.out.println("\n======>>> getter()");
//	}
//	
//	// create pointcut for setter methods
//	@Pointcut("execution(* io.spring.tutorial.part07.dao.*.set*(..))")
//	public void setter() {
//		System.out.println("\n======>>> setter()");
//	}
//	
//	// create pointcut: include package ... exclude getter/setter
//	@Pointcut("forDaoPackage() && !(getter() || setter())")
//	public void forDaoPackageNoGetterSetter() {
//		
//	}

	// add a new advice for @AfterReturning on the findAccounts method
	@AfterReturning(pointcut = "execution(* io.spring.tutorial.part07.dao.AccountDAO.findAccounts(..))", returning = "result")
	public void afterReturningFindAccountsAdvice(JoinPoint joinPoint, List<Account> result) {
		
		// print out which method we are advising on
		String method = joinPoint.getSignature().toShortString();
		System.out.println("\n======>>> Executing @AfterReturning on method: " + method);
		
		// print out the results of the method call
		System.out.println("\n======>>> result is: " + result);
	}
}
