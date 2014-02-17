package ca.uhn.fhir.model.api;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(value= {ElementType.FIELD})
public @interface Constraint {

	String[] coRequirements() default {};

	String[] lessThan() default {};
	
	String[] greaterThan() default {};
}
