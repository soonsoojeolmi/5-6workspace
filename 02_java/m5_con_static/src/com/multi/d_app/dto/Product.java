package com.multi.d_app.dto;

public class Product {
    // 필드 (제품명, 브랜드명, 가격)
    private String name;
    private String brand;
    private int price;

    // 기본 생성자
    public Product() {}

    // 매개변수 있는 생성자
    public Product(String name, String brand, int price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    // Getter & Setter 메서드
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // toString() 메서드 (객체 정보를 문자열로 반환)
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }


}
