package org.liveSense.misc.jsr303.test.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.liveSense.misc.jsr303.test.UserBean;
import org.liveSense.misc.jsr303.test.annotation.UserBeanPasswordAndConfirmationEquals;

public class UserBeanPasswordAndConfirmationValidator implements ConstraintValidator<UserBeanPasswordAndConfirmationEquals, UserBean> {

	public void initialize(
			UserBeanPasswordAndConfirmationEquals constraintAnnotation) {		
	}

	public boolean isValid(UserBean value, ConstraintValidatorContext context) {
		if (value != null && value.getPassword() != null && value.getPassword().equals(value.getPasswordConfirmation())) 
			return true;
		else return false;
	}


}
