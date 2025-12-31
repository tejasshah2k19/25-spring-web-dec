package com.bean;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class EmployeeBean {

	Integer employeeId; 
	
	@NotBlank(message = "Please Enter Valid First Name")
	@Pattern(regexp = "[a-zA-Z]+",message = "Please Enter Valid FirstName")
	String firstName;

	@NotBlank
	String lastName;

	@NotBlank
	String email;

	@NotBlank
	String password;

	@NotNull(message = "Please Enter Birth Year")
	@Min(value = 1955, message = "Age can be >= 18 and <= 70")
	@Max(value = 2006, message = "Age can be >= 18 and <= 70")
	Integer birthYear;

	@NotBlank
	String position;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(Integer birthYear) {
		this.birthYear = birthYear;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

}
