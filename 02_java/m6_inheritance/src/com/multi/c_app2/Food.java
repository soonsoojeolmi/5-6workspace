package com.multi.c_app2;

public class Food extends MenuItem{

    private String foodType;
    public Food(String name, int price, String foodType){
        super(name, price);
        this.foodType = foodType;

    }

    @Override
    public String toString() {
        return "Food{" +
                "foodType='" + foodType + '\'' +
                '}';
    }
}
