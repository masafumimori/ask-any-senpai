package com.masafumimori.studyabroad.model.form;

import java.io.Serializable;

public class UserForm implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String userName;
	private String password;
	private String fullName;
	private String email;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}