package com.multi.a_basic.functional;

@FunctionalInterface
public interface A_Func {
    //매개변수가 없고 반환값이 없는추상메소드
    void method();

    //void method1(); //gFunctionalInterface로 체크, 메소드가 2개이면 컴페일 에러 발
}

