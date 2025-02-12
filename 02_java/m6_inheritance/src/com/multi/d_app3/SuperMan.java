package com.multi.d_app3;

public class SuperMan extends Man{
    private boolean fly;

    public SuperMan(int age, String name, int power, boolean fly){
        super(age, name, power);
        this.fly = fly;
    }

    public void space(){
        System.out.println("우주에서");
    }
}
