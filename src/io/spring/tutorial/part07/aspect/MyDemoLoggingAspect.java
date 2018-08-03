package io.spring.tutorial.part07.aspect;

import java.util.List;
import java.util.stream.Collectors;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
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

		// let's post-process tha data ... let's modify it
		// convert the account names to upper case
		result = result.stream().map(a -> {
			Account account = new Account();
			account.setName(a.getName().toUpperCase());
			account.setLevel(a.getLevel());
			return account;
		}).collect(Collectors.toList());

		// print out the results of the method call
		System.out.println("\n======>>> upper result is: " + result);
	}

	@AfterThrowing(pointcut = "execution(* io.spring.tutorial.part07.dao.AccountDAOImpl.findAccounts(..))", throwing = "exc")
	public void afterThrowingFindAccountsAdvice(JoinPoint joinPoint, Throwable exc) {

		// print out which method we are advising on
		String method = joinPoint.getSignature().toShortString();
		System.out.println("\n======>>> Executing @AfterThrowing on method: " + method);

		// log the exception
		System.out.println("\n======>>> The exception is: " + exc);
	}

	@After("execution(* io.spring.tutorial.part07.dao.AccountDAOImpl.findAccounts(..))")
	public void afterFinallyFindAccountsAdvice(JoinPoint joinPoint) {
		// print out which method we are advising on
		String method = joinPoint.getSignature().toShortString();
		System.out.println("\n======>>> Executing @After (finally) on method: " + method);
	}

	@Around("execution(* io.spring.tutorial.part07.service.*.getFortune(..))")
	public Object aroundGetFortune(ProceedingJoinPoint joinPoint) throws Throwable {
		
		// print out method we are advising on
		String method = joinPoint.getSignature().toShortString();
		System.out.println("\n======>>> Executing @Around (finally) on method: " + method);
		
		// get begin timestamp
		long begin = System.currentTimeMillis();
		
		// now, let's execute the method
		Object result = joinPoint.proceed(); // -> joinPoint: Handle to target method, .proceed() -> Execute the target method
		
		// get end timstamp
		long end = System.currentTimeMillis();
		
		// compute duration and display it
		long duration = end - begin;
		System.out.println("\n===>>> Duration: " + duration / 1000.0 + " seconds");
		
		return result;
	}
}
