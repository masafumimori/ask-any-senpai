package com.masafumimori.studyabroad.model.domain;

import java.sql.Timestamp;

import com.masafumimori.studyabroad.model.form.UserForm;

public class MstUser {
	
	private int id;
	private String userName;
	private String password;
	private String email;
	private String area;
	private String nation;
	private String purpose;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	
	public MstUser() {}
	
	public MstUser(UserForm f) {
		userName = f.getUserName();
		password = f.getPassword();
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
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
