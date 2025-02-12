package com.multi.e_reg;

import java.util.regex.Pattern;

public class RegularExpressionTest1 {

	public static void main(String[] args) {
		String pt = "^[a-zA-Z]*$"; // 영문자로 시작하고 끝나는 0개이상의 영문 단어
		String str1 = "abcaa";
		String str2 = "123";
		String str3 = "";

		boolean result1 = Pattern.matches(pt, str1);
		boolean result2 = Pattern.matches(pt, str2);
		boolean result3 = Pattern.matches(pt, str3);

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}
}