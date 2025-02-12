package com.multi.a_classmake;

public class MethodPrinter {
    public void methodA(){
        System.out.println("메소드A 출력문");
        methodB();//같은 클래스내에서는 메소드 명으로 호출 가능
    }
    public void methodB(){
        System.out.println("메소드B 출력문");
        int a =  methodC(100);

        System.out.println(a);
    }
    public int methodC(int value){
        System.out.println("메소드C 출력문"+value);
        return value + 100;
    }
}
