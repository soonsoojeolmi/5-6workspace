package com.multi.poly.a_abstract;

public class SmartPhone extends Product{
    //추상클래스가   가지는 추상메소드를 반드시 구현

    @Override
    public void method3(){
        System.out.println("Product 클래스의 추상메소드 구현");
    }

    public void method4(){
        System.out.println("SmartPhone  의 일반메소드");
    }
}
