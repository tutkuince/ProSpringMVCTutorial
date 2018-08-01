package io.spring.tutorial.part07.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyCloudLogAsyncAspect {
	@Before("io.spring.tutorial.part07.aspect.AOPExpressions.forDaoPackageNoGetterSetter()")
	public void logToCloudAsync() {
		System.out.println("\n======>>> Logging to Cloud in async fashion");
	}
}
