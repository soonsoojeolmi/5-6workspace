package com.multi.c_app2;

public class Dessert extends Food{

    private String dessertType;// 디저트 종류 (예: 케이크, 아이스크림)
    public Dessert(String name, int price, String dessertType){
        super(name,  price, "Dessert");
        this.dessertType = dessertType;
    }

    @Override
    public String toString() {
        return "Dessert{" +
                "dessertType='" + dessertType + '\'' +
                '}';
    }
}
