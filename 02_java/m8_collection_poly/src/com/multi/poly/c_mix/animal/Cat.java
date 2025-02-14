package com.multi.poly.c_mix.animal;

public class Cat extends Animal implements Action {

    public Cat(String name){
        super(name);
    }

    @Override
    public void makeSound() {
        sound();
    }

    @Override
    public void eat() {
        System.out.println(getName()+"은 츄르를 먹습니다.");
    }

    @Override
    public void play() {
        System.out.println(getName()+"은 장난감을가지고 놉니다.");
    }

    public void sound(){
        System.out.println(getName()+"은 야옹하고 소리를 냅니다.");
    }
}
