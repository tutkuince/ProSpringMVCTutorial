package io.spring.tutorial.part06.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private String coursePrefix;
	
	@Override
	public boolean isValid(String code, ConstraintValidatorContext constraintValidatorContext) {
		
		return code.startsWith(coursePrefix);
	}
	
	@Override
	public void initialize(CourseCode constraintAnnotation) {
		coursePrefix = constraintAnnotation.value();
	}

}
