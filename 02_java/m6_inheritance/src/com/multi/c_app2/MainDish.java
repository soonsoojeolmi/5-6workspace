package com.multi.c_app2;

public class MainDish extends Food{

    public MainDish(String name, int price){
        super(name, price, "Main");
    }

    @Override
    public String toString() {
        return "MainDish{}" + super.toString();
    }
}
