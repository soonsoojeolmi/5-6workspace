package com.multi.a_basic;

public class PrintTest {
    public static void main(String[] args) {
        //1.숫자출력 --> 따옴표 없이
        System.out.println(123);  //정수값출력
        System.out.println(1.23); //실수값출력

//2.문자(한글자) 출력 --> 따옴표 이용
        System.out.println('a');
        System.out.println('b');

//3.문자열(여러글자) 출력 --> 쌍따옴표 이용 (그냥 따옴표안됨)
        System.out.println("안녕하세요");
        System.out.println("반갑습니다.");

//4.연산한 결과 값도 출력가능
        System.out.println(123+456);
        System.out.println(1.23-0.12);

//5.문자와 숫자 연산가능 --> 문자와 숫자 연산시 문자를 자동으로 숫자로 인식
        System.out.println('a'+1);// 각 문자마다 컴퓨터가 인식하는 고유한 숫자값을 가지고 있음 // a==97

//6.문자열 ("") 과 그외의 값을 덧셈연산 -->문자열화됨
        System.out.println("하이"+'a');
        System.out.println("안녕하세요"+123);
        System.out.println("반갑습니다"+111+222);

//7.논리형태값출력
        System.out.println(true);
        System.out.println(false);
    }
}
