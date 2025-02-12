package com.multi.e_reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionTest2 {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("^[0-9]*$"); 
		// 숫자로 시작하고 끝나는
		String str1 = "abcaa";
		String str2 = "123";
		String str3 = "";

		Matcher result1 = pattern.matcher(str1);
		Matcher result2 = pattern.matcher(str2);
		Matcher result3 = pattern.matcher(str3);

		System.out.println(result1.find());
		System.out.println(result2.find());
		System.out.println(result3.find());

		//검사할 데이터
		String name = "김길동";
		String tel = "010-1234-5678";
		String email = "test@naver.com";

		//유효성 검사로 확인
		//^는 시작의 의미
		//$는 종료의 의미
		//[]는 범위를 적을 때 사
		//*는 0~무한대의 횟수
		//+는 1~무한대의 횟수
		//?는 0,1 중 횟수 지정
		//\\w는 문자 전체, \\d는 숫자 전체
		//(a|b|c)는 선택(or)의 의미

		boolean name_check = Pattern.matches("^[가-힣]*$", name); //한글만!
		boolean tel_check = Pattern.matches("^01(?:0|1|[6-9])-(?:\\d{3}|\\d{4})-\\d{4}$", tel);
		//                                  01로 시작하고  0이나 1이나 6-9까지 한번 나올 수도 있고 안나올 수도 있고!
		//									-나오고
		//									숫자3개 또는 숫자4개가 나오고
		//									-나오고
		//									숫자4개로 끝나는 패턴
		boolean email_check = Pattern.matches("\\w+@\\w+\\.\\w+(\\.\\w+)?", email);
		//결과 출력
		System.out.println("이름 : " + name_check);
		System.out.println("전화번호 : " + tel_check);
		System.out.println("이메일 : " + email_check);


	}
}