package com.multi.b_variable;
// 자바는 변수를 만들 때, 어떤 타입의 데이터를 넣을지 미리 결정
//선언 :  타입 변수명 ==> 변수가 생성됨!
//기본 데이터 4가지: 정수, 실수, 문자, 논리
//기호 => 연산자
      /*//1. 논리형
boolean isTrue;  // true, false , 0 , 1  // 1byte

//2. 숫자형
//2_1 정수형

byte bNum;     // 1byte -128~127
short sNum;     // 2byte  -3만 ~3만
int iNum;      // 4byte -> 정수형중에 가장 대표적인 자료형 (기본형 ) -21억 ~ 21억xxx 까지의 값이 담기는 자료형
long lNum;     // 8byte 21억 이상

//2_2 실수형
float fNum;    // 4byte
double dNum;    // 8byte -> 실수형중에 가장 대표적인 자료형(기본형 )

//float은 소수점 아래 7짜리까지 표현이 가능하고
//double은 소수점 아래 15자리까지 표현이 가능해서 double이 좀 더 정확하다  그래서 실수형중에서 기본형이 double이다.


//3. 문자형
char ch;       //2byte

//------------------여기 까지가 기본 자료형 (8개)
 *
 *
//4. 문자열(참조자료형)
String str;*/
public class Exec02 {
    public static void main(String[] args) {
        // 자바는 변수를 만들 때, 어떤 타입의 데이터를 넣을지 미리 결정
//선언 :  타입 변수명 ==> 변수가 생성됨!
//기본 데이터 4가지: 정수, 실수, 문자, 논리
//기호 => 연산자
        int age = 100;
        double height = 122.2;
        char gender = '남';
        boolean food = true;//false
        long space = 1000000000L;// long 타입 변수에 int가 업캐스팅 되어 할당
// 숫자를 그냥 쓰는경우 int 로 인식, 21억보다 큰 111억을 쓰면 int 의 범위를 벗어났다고 에러 //숫자뒤에 long 타입이라고 명시 해주어야함
        int money = 50000; // 또는 long money = 50000L;
        System.out.println("내 은행에 든 돈 : " + money + "원");
    }
}
