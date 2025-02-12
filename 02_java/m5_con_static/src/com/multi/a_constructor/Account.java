package com.multi.a_constructor;

public class Account {
    private String name;
    private int money;
    private String field;

    //기본 생성자 : public 클래스명 (){} -> 매개변수 없는 생섲ㅇ자, 단지 객체생성만 할 때, 다른 매개변수가 있는 생성자가 없을때는 생략 가능, 묵시적으로 jvm 자동 생성
    public Account(){}

    //매개변수 있는 생성자 : 필요시 사용자가 만듦 , public 클래스명(매개변수){
    //                                                  this.필드명 = 매개변수
    //                                                     }
    //객체 생성과 동시에 초기화가 필요할 때 사용
    //this => 인스턴스(생성된 객체)의 주소가 저장되어 있음.
    public Account(String name){
        this.name = name;
    }

    public Account(String name, String field){
        this.name=name;
        this.field=field;
    }

    public Account(String name, String field, int money){
        //this.name=name;
        //this.field=field;
        //this.money=money;
        this(name, field);//기존 생성자를 호출할 때는 반드시 첫 줄에 사용this()
        this.money=money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", money=" + money +
                ", field='" + field + '\'' +
                '}';
    }
}
