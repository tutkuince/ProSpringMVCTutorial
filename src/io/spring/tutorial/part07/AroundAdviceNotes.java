package io.spring.tutorial.part07;

public class AroundAdviceNotes {
	/**
	 * @Around Advice - Use Cases
	 *  + Most common: logging, auditing, security
	 *  + Pre-processing and post-processing data
	 *  + Instrumentation/profiling code
	 * 		- How long does it take for a section of code to run?
	 * 	+ Managing exceptions
	 * 		- Swallow / handle / stop exception
	 * 
	 * ProceedingJoinPoint
	 * 	+ When using @Around advice
	 * 	+ You will get a reference to a "proceeding join point"
	 * 	+ This is a handle to the target method
	 * 	+ Your code can use the proceeding join point to execute target method
	 * 
	 * Resolving Print Order Issue
	 * + Root Cause
	 * 		- The data is printing to two different output streams
	 * 		- Spring is printing to the logger output stream
	 * 		- System.out.prinln is printing to the standard out output stream
	 * + Solution
	 * 		- To have everything in order, you should send to same output stream
	 * 		- We'll change our code to use the logger output stream ... same as Spring
	 * */
}
