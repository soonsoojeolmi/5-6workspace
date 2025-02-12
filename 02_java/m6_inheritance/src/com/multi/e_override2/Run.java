package com.multi.e_override2;

public class Run {
    public static void main(String[] args) {

        Book bk1 = new Book("채식주의자", "한강", 10000);
        Book bk2 = new Book("지구 끝의 온실", "김초엽", 20000);

        System.out.println(bk1);
        System.out.println(bk2);

        Book bk3 = new Book( "채식주의자", "한강", 10000);

        System.out.println(bk1 == bk3);
        System.out.println(bk1.equals(bk3));


        //오버라이딩 전 : Object 클래스의 equals 메소드가 실행 -> 두주소값을 비교
//오버라이딩 후 : 두객체의 주소값 비교가 아닌 실제 필드 값들이 같은경우 true를 반환하도록 재정의

//동등객체 : 실제 필드값은 같지만 해쉬코드값이 다른경우
//동일객체 : 실제 필드값도 같고 해쉬코드 값도 같은경우 --> 동일 객체라는건 중복된다는 말

        System.out.println(bk1.hashCode());
        System.out.println(bk3.hashCode());

        //오버라이딩 전 : Object 클래스의 hashCode() 메소드 실행 --> 해당 객체의 실제 주소값을 10진수로 계산한 결과
//오버라이딩 후 : 두객체의 실제주소값을 가지고 작업 하지않고 두객체의 실제 멤버의 값들이 같은경우 같은 해쉬코드값이 나오도록 재정의
    }
}
