package io.spring.tutorial.part07.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AOPExpressions {
	// create pointcut for getter methods
	@Pointcut("execution(* io.spring.tutorial.part07.dao.*.get*(..))")
	public void getter() {
		System.out.println("\n======>>> getter()");
	}

	// create pointcut for setter methods
	@Pointcut("execution(* io.spring.tutorial.part07.dao.*.set*(..))")
	public void setter() {
		System.out.println("\n======>>> setter()");
	}

	// create pointcut: include package ... exclude getter/setter
	@Pointcut("forDaoPackage() && !(getter() || setter())")
	public void forDaoPackageNoGetterSetter() {

	}

	@Pointcut("execution(* io.spring.tutorial.part07.dao.*.*(..))")
	public void forDaoPackage() {
	}
}
