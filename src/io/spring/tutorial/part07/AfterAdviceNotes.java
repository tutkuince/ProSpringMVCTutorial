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
	 * 
	 * 
	 */
}
