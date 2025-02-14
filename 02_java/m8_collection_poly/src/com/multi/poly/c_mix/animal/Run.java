package com.multi.poly.c_mix.animal;

public class Run {
    public static void main(String[] args) {
        //Dog
        Dog dog= new Dog("초코");
        dog.makeSound();
        dog.eat();
        dog.play();
        dog.sound();

        //Cat
        Cat cat = new Cat("야통");
        cat.makeSound();
        cat.eat();
        cat.play();
        cat.sound();
    }
}
