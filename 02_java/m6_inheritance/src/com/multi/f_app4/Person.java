package com.multi.f_app4;

public sealed class Person permits com.multi.f_app4.Employee, com.multi.f_app4.Manager {

    //필드
    private  String name;

    //메소드
    public void work(){
        System.out.println("하는 일이 결정되지 않았습니다.");
    }
}
