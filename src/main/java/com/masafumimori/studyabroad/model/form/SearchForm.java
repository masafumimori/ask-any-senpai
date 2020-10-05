package com.masafumimori.studyabroad.model.form;

import java.io.Serializable;

public class SearchForm implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String keywords;
	private String areas;
	private String nations;
	
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public String getAreas() {
		return areas;
	}
	public void setAreas(String areas) {
		this.areas = areas;
	}
	public String getNations() {
		return nations;
	}
	public void setNations(String nations) {
		this.nations = nations;
	}
}
