package org.liveSense.misc.jsr303.test;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.liveSense.misc.jsr303.test.annotation.CustomerNumber;
import org.liveSense.misc.jsr303.test.annotation.UserBeanPasswordAndConfirmationEquals;

@UserBeanPasswordAndConfirmationEquals
public class UserBean {
	@NotNull
	@Size(min = 2)
	private String	firstName;
	
	@NotNull
	@Size(min = 2)
	private String	lastName;
	
	@NotNull
	@Past
	private Date	birthday;
	
	@NotNull
	@CustomerNumber
	private String	customerNumber;

	@NotNull
	@Pattern(regexp = "^[a-zA-Z]{2}-\\d+$")
	private String	regexpNumber;
	
	@NotNull
	@Size(min=5, max=12)
	private String password;
	
	@NotNull
	@Size(min=5, max=12)
	private String passwordConfirmation;
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Date getBirthday() {
		return birthday;
	}
	
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	public String getCustomerNumber() {
		return customerNumber;
	}
	
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getRegexpNumber() {
		return regexpNumber;
	}

	public void setRegexpNumber(String regexpNumber) {
		this.regexpNumber = regexpNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordConfirmation() {
		return passwordConfirmation;
	}

	public void setPasswordConfirmation(String passwordConfirmation) {
		this.passwordConfirmation = passwordConfirmation;
	}
}