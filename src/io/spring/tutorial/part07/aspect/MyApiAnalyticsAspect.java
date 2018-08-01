package io.spring.tutorial.part07.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class MyApiAnalyticsAspect {
	@Before("io.spring.tutorial.part07.aspect.AOPExpressions.forDaoPackageNoGetterSetter()") // reuse of pointcut expression declaration
	public void performApiAnalytics() {
		System.out.println("\n======>>> Performing API analytics");
	}
}
