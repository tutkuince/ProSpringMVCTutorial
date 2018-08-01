package io.spring.tutorial.part07.main;

public class PointcutExpressionCombininingNotes {
	/**
	 * Combinining Pointcut Expressions
	 * 
	 * Combine pointcut expressions using logic operators
	 * 	+ AND 	(&&)
	 *  + OR 	(||)
	 *  + NOT 	(!)
	 *  
	 * Works like an 'if' statement
	 * Execution happens only if it evaluates to true
	 * 
	 * @Before("expressionOne() && expressionTwo()")
	 * @Before("expressionOne() || expressionTwo()")
	 * @Before("expressionOne() && !expressionTwo()")
	 * 
	 * */
}
