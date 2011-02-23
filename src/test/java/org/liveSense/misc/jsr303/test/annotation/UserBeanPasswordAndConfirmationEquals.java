package org.liveSense.misc.jsr303.test.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import org.liveSense.misc.jsr303.test.validator.UserBeanPasswordAndConfirmationValidator;


@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = UserBeanPasswordAndConfirmationValidator.class)

public @interface UserBeanPasswordAndConfirmationEquals {
	String message() default "Password does not match";
	 
	Class<?>[] groups() default {};
 
	Class<? extends Payload>[] payload() default {};

}
