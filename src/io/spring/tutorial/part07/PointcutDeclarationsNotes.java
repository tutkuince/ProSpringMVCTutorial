package io.spring.tutorial.part07;

public class PointcutDeclarationsNotes {
	/**
	 * Create a pointcut declaration once
	 * Apply it to multiple advices
	 * 
	 * @Pointcut("execution(* io.spring.tutorial.part07.dao.*.*(..))")
	 * private void forDaoPackage(){}   
	 * 
	 * Benefits of Pointcut Declarations
	 * 
	 * 	+ Easily reuse pointcut expressions
	 *  + Update pointcut in one location
	 *  + Can also share and combine pointcut expressions
	 * 
	 * */
}
