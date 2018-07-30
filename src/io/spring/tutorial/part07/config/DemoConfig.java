package io.spring.tutorial.part07.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy	// Spring AOP Proxy Support
@ComponentScan("io.spring.tutorial.part07")
public class DemoConfig {

}
