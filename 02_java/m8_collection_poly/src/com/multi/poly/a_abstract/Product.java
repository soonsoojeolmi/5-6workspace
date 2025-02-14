package com.multi.poly.a_abstract;

public abstract class Product {

    private int nonStaticField;
    private static int  staticField;

    //생성자를  만들 수 있는데 객체를 생성할 수는 없음
    public Product(){}

    public void method1(){
        System.out.println("일반적인 메소드");
    }

    public static void method2(){
        System.out.println("스테틱 메소드");
    }

    //추상메서드를 만드는 경우  public abstract 를 생갹할 수 없다
    //추상메서드가 하나라도 있으면 클래스에 abstract  키워드로 추상클래스로 만들어줘야 함
    public abstract  void  method3();
}
