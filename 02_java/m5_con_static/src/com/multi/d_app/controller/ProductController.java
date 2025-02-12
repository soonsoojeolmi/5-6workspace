package com.multi.d_app.controller;

import com.multi.d_app.dto.Product;

public class ProductController {
    private Product pro = null;

    public void insertProduct(String name, String brand, int price){
        pro = new Product(name, brand, price);
    }

    public Product selectPro(){
        return pro;
    }

    public void updatePrice(int price) {
        pro.setPrice(price);
    }

}
