package org.liveSense.misc.jsr303.test.validator;
 
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.liveSense.misc.jsr303.test.annotation.CustomerNumber;
 
public class CustomerNumberValidator implements ConstraintValidator<CustomerNumber, String> {
 
	public void initialize(CustomerNumber number) {
	}
 
	public boolean isValid(String customerNumber, ConstraintValidatorContext ctx) {
		if (customerNumber == null)
			return false;
 
		if (customerNumber.matches("^[a-zA-Z]{2}-\\d+$"))
			return true;
		return false;
	}
}