package com.multi.poly.c_mix.patten.dto;

public class NJZ implements Singer {
    public void sing() {
        System.out.println("노래부르는 하니 ");
    }

    public void compose() {
        System.out.println("작곡하는 하니 ");
    }

    @Override
    public void dance() {
        System.out.println("춤추는 하니");
    }
}
