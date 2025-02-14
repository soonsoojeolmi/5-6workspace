package com.multi.poly.c_mix.patten.singleton;

public class Run {
    //싱글톤패턴
    public static void main(String[] args) {
//        Singleton singleton1 = new Singleton();
//        Singleton singleton2 = new Singleton();
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1);
        System.out.println(singleton2);
    }
}
