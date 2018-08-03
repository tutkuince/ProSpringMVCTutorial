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
	 * */
}
