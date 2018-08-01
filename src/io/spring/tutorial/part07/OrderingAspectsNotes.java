package io.spring.tutorial.part07;

public class OrderingAspectsNotes {
	/**
	 * To Control Order
	 *  + Refactor: Place advices in separate Aspects
	 *  + Control order on Aspects using the @Order annotation
	 *  + Guarantees order of when Aspects are applied
	 *  
	 * Development Process
	 * 	1) Refactor: Place advices in separate Aspects
	 * 	2) Add @Order annotation -> @Order(1)
	 * 		+ Guarantees order of when Aspects are applied
	 * 		+ Lower numbers have higher precedence 
	 * 
	 * */
}
