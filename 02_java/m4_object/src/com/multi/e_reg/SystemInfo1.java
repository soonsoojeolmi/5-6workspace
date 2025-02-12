package com.multi.e_reg;

public class SystemInfo1 {
	public static void main(String[] args) {
		System.out.println("Java 버전 : " + System.getProperty("java.version"));
		System.out.println("Java 공급자 : " + System.getProperty("java.vendor"));
		System.out.println("Java 공급자 주소 : " + System.getProperty("java.vendor.url"));
		System.out.println("Java가 위치한 디렉토리 : " + System.getProperty("java.home"));
		System.out.println("Java 클래스 버전 : " + System.getProperty("java.class.version"));
		System.out.println("Java 클래스의 경로 : " + System.getProperty("java.class.path"));
		System.out.println("확장기능의 클래스 경로 : " + System.getProperty("java.ext.dir"));
		System.out.println("사용자 홈 디렉토리 : " + System.getProperty("user.name"));
		System.out.println("현재 디렉토리 : " + System.getProperty("user.dir"));
		System.out.println("운영체제 이름 : " + System.getProperty("os.name"));
		System.out.println("운영체제 아키텍처 : " + System.getProperty("os.arch"));
		System.out.println("운영체제 버전 정보 : " + System.getProperty("os.version"));
		System.out.println("파일 구분 문자 : " + System.getProperty("file.separator"));
		System.out.println("경로 구분 문자: " + System.getProperty("path.separator"));
		System.out.println("행 구분 문자 : " + System.getProperty("line.separator"));
	}
}
