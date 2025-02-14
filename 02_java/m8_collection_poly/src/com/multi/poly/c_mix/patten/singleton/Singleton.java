package com.multi.poly.c_mix.patten.singleton;

public class Singleton {
    private static final Singleton singleton = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        return singleton;
    }
}
