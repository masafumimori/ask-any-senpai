package com.masafumimori.studyabroad.model.domain;

import com.masafumimori.studyabroad.model.form.InquiryForm;

public class Inquiry {

	private int id;
	private String subject;
	private String name;
	private String email;
	private String content;
	
	public Inquiry() {};
	
	public Inquiry(InquiryForm f) {
		subject = f.getSubject();
		name = f.getName();
		email = f.getEmail();
		content = f.getContent();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
