package com.multi.poly.b_interface;

public class Product implements InterProduct {

    @Override
    public void method1() {
        System.out.println("InterProduct 의 메소드 오버라이딩");
    }

    // static 메소드는 오버라이드 할 수 없음
//    @Override
//    public static void staticMethod() {}
//
//    // default 메소드는 인터페이스에서만 사용가능하다
//    @Override
//    default void defaultMethod() {}

    // default 를 제거하고 오버라이드가능
    @Override
    public void defaultMethod() {
        System.out.println("디폴트메소드 재정의");
    }
}
