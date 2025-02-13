package com.multi.f_app4;

public final class Employee extends Person{
    // final을 붙여서 더 이상 클래스를 상속받지 못하게 정의

    @Override
    public void work(){
        System.out.println("제품을생산합니다.");
    }
}
