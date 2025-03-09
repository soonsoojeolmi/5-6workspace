package com.multi.jsp02.member;

public class MemberDTO {
	private String id;
	private String pw;
	private String name;
	private String tel;
	

	public void setId(String id) { //setter
		this.id = id;
	}
	public String getId() { //getter
		return id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "가방에 들어있는 데이터 [id=" + id + ", pw=" + pw + ", name=" + name + ", tel=" + tel + "]";
	}
	
}


