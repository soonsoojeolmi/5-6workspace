package com.multi.poly.c_mix.animal;

public class Dog extends Animal implements Action {
    public Dog(String name){
        super(name);
    }

    @Override
    public void makeSound() {
        sound();
    }

    @Override
    public void eat() {
        System.out.println(getName()+"은 사료를 먹습니다.");
    }

    @Override
    public void play() {
        System.out.println(getName()+"은 공을 가지고 놉니다.");
    }

    @Override
    public void sound() {
        System.out.println(getName()+"은 짖어");
    }
}
