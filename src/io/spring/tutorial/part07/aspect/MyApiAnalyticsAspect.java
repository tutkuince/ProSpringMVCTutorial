package io.spring.tutorial.part07.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyApiAnalyticsAspect {
	@Before("forDaoPackageNoGetterSetter()") // reuse of pointcut expression declaration
	public void performApiAnalytics() {
		System.out.println("\n======>>> Performing API analytics");
	}
}
