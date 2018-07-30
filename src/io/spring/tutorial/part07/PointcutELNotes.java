package io.spring.tutorial.part07;


public class PointcutELNotes {
	/**
	 * Pointcut Expression Language
	 * execution(modifiers-pattern? return-type-pattern declaring-type-pattern? method-name-pattern(param-pattern) throws-pattern?)
	 * 
	 *  + The pattern is optional if it has '?'
	 *  + Patterns can use wildcards
	 *  
	 *  @Before("execution(public void addAccount())")
	 *  
	 *  Match on method names (using wildcards)
	 *   + Match methods starting with add in any class
	 * 	 @Before("execution(public void add*())")
	 * 	 @Before("execution(* * add*())")
	 * 
	 * Parameter Pattern Wildcards
	 *  + () 	- matches a method with no arguments
	 *  + (*)	- matches a method with one argument of any type
	 *  + (..)	- matches a method with 0 or more arguments of any type
	 * */
}
