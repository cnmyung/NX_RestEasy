package com.chrismyung.models;

import java.util.List;


public class Student {
	private String name;
	private String gender;
	private String classLevel;
	private String homeState;
	private String major;
	private String extracurricularActivity;
	
	public Student() {}
	
	public Student(String name, String gender, String classLevel, String homeState, String major,
			String extracurricularActivity) {
		super();
		this.name = name;
		this.gender = gender;
		this.classLevel = classLevel;
		this.homeState = homeState;
		this.major = major;
		this.extracurricularActivity = extracurricularActivity;
	}
	public Student(List<Object> row) {
		this.name = row.get(0).toString();
		this.gender = row.get(1).toString();
		this.classLevel = row.get(2).toString();
		this.homeState = row.get(3).toString();
		this.major = row.get(4).toString();
		this.extracurricularActivity = row.get(5).toString();
		
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public String getClassLevel() {
		return classLevel;
	}

	public String getHomeState() {
		return homeState;
	}

	public String getMajor() {
		return major;
	}

	public String getExtracurricularActivity() {
		return extracurricularActivity;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gender=" + gender + ", classLevel=" + classLevel + ", homeState="
				+ homeState + ", major=" + major + ", extracurricularActivity=" + extracurricularActivity + "]";
	}
	
	

}
