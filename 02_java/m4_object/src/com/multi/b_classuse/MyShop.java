package com.multi.b_classuse;

import com.multi.a_classmake.Calculator;
import com.multi.a_classmake.Calculator2;

public class MyShop {
    public static void main(String[] args) {
        Calculator cal1 = new Calculator();

        Calculator2 cal2 = new Calculator2();
        System.out.println(cal2.add(100,200));

        int result =  cal2.mul(100,200);
        System.out.println(result);

        cal2.div(100,200);
        cal2.div(100.5,200);
    }
}
