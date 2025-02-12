package com.multi.d_app3;

public class Human {
    private int age;
    private String name;

    public Human(int age, String name){
        this.age = age;
        this.name = name;
    }

    public void eat(){
        System.out.println("먹다");
    }

    public void sleep(){
        System.out.println("자다");
    }
}
