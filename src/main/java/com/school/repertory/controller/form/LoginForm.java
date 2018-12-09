package com.school.repertory.controller.form;

import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

public class LoginForm {
	@NotBlank
	@Length(max=16)
	private String username;
	
	@NotBlank
	@Length(max=32)
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
