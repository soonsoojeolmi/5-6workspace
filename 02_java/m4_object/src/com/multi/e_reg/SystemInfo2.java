package com.multi.e_reg;

public class SystemInfo2 {
	public static void main(String[] args) {
		//String value = Sytstem.getenv(String name); //사용법
		System.out.println("전체 OS 환경변수 값 : " + System.getenv());
		System.out.println("OS 환경변수 NVM_SYMLINK 값: " + System.getenv("NVM_SYMLINK"));
	}
}
