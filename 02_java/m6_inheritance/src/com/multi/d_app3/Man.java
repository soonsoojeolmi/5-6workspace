package com.multi.d_app3;

public class Man extends Human{
    private int power;

    public Man(int age, String name, int power){
        super(age, name);
        this.power = power;
    }

    public void run(){
        System.out.println("뛰다");
    }
}
