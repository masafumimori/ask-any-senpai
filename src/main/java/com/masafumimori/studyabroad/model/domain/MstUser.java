package com.masafumimori.studyabroad.model.domain;

import java.sql.Timestamp;

import com.masafumimori.studyabroad.model.form.UserForm;

public class MstUser {
	
	private int id;
	private String userName;
	private String password;
	private String fullName;
	private String email;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	
	public MstUser() {}
	
	public MstUser(UserForm f) {
		userName = f.getUserName();
		password = f.getPassword();
		fullName = f.getFullName();
		email = f.getEmail();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	public Timestamp getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

}
