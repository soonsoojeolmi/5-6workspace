package com.multi.poly.c_mix.patten.dto;

public class Aespa implements Singer {
    public void sing() {
        System.out.println("노래부르는 닝닝 ");
    }

    public void compose() {
        System.out.println("작곡하는 닝닝 ");
    }

    @Override
    public void dance() {
        System.out.println("춤추는 닝닝");
    }
}
