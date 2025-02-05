package com.multi.a_basic;//패키지
/*
 *  ** 원칙 **
 *  1. 클래스명 --> 대문자로 시작
 *  2. 패키지명 --> 소문자로 시작
 *  3. 메소드명 --> 소문자로 시작
 *  4. 변수명    --> 소문자로 시작
 *
 *  단, 여러개의 단어가 있을 때는 단어 앞자리마다 대문자로 !! == 낙타 표기법(개발자간의 예의)
 *
 *  ex) 클래스명 Methodprinter --> MethodPrinter
 *      메소드명 testprint --> testPrint
 *
 *  그리고 항상 의미있게 이름짓자!!
 * 
 * spout tab누르면 출력문장 자동 생성
 *
 * https://docs.oracle.com/en/java/javase/17/docs/api/index.html
 */
//- **표준 입출력 (System.in, System.out, System.err)**
//- 콘솔(console, 화면)을 통한 데이터의 입출력을 말함.
//- JVM이 시작되면서 자동적으로 생성되는 스트림 à 스트림을 열고 닫을 필요가 없다.
//- 보통 단독으로 사용하지 않는다.
//- System.out :표준 출력(모니터) 스트림 System.out.println("출력 메세지");
//- System.in : 표준 입력(키보드) 스트림 int d = System.in.read() // 한 바이트 읽기
//- System.err : 표준 에러 출력(모니터) 스트림 System.err.println("에러 메세지");
public class HelloWorld {
    //public : 메인메소드는 외부에서 호출할수있다.
    //static : 객체를 생성하지 않고도 실행 시킬수있다.
    //void : 반환값이 없으니까
    //String[] args : 파라미터, 실행 명령어외에 인자를 받을수 있는데 스트링 배열로 들어감
    public static void main(String[] args) {
        System.out.println("안녕하세요");
    }
}
