package com.uni.stream.a_basic.dto;

public class Member implements Comparable<Member> {
	private int idx;
	
	private String name;
	
	private int age;
	
	private String gender;
	
	public Member() {
	}	

	public Member(int idx, String name, int age, String gender) {
		this.idx = idx;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
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
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

	@Override
	public int compareTo(Member member) {		
		// this.age < member.age : 음수리턴
		// this.age = member.age : 0 리턴
		// this.age > member.age : 양수리턴		
		return Integer.compare(this.age, member.age);
	}
}
