package io.spring.tutorial.part07;

public class AfterAdviceNotes {
	/**
	 * @After runs after a method is completed. Regardless of outcome / exceptions.
	 * 
	 * @After will run for success or failure (finally)
	 * 
	 * @After will execute before @AfterThrowing
	 * 
	 * Use Cases
	 * 	+ Log the exception and/or perform auditing
	 *  + Code to run regardless of method outcome
	 *  + Encapsulate this functionality in AOP aspect for easy reuse
	 * 
	 * @After Advice - Tips
	 *  + If The @After advices does not have access to the exception
	 *  	- If you need exception, then use @AfterThrowing advice
	 *  + The @After advice should be able to run in the case of success or error
	 *  	- Your code should not depend on happy path or an exception
	 *  	- Logging/auditing is the easiest case here
	 * 
	 * 
	 */
}
