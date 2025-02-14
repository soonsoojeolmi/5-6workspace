package com.multi.poly.c_mix.animal;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sleep(){
        System.out.println(name + "이 잠을 잡니다.");
    }

    public abstract void sound();

}
