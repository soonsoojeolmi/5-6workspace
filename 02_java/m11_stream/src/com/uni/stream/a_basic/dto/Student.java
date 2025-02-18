package com.uni.stream.a_basic.dto;

public class Student {
	private String name;
	
	private int age;
	
	private String gender;
	
	private int math;
	
	private int english;
	
	public Student() {
	}

	public Student(String name, int age, String gender, int math, int english) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.math = math;
		this.english = english;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", gender=" + gender + ", math=" + math + ", english="
				+ english + "]";
	}	
}
