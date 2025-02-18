package com.multi.c_practice;

public class Button {
    //정적 멤버 인터페이스
    @FunctionalInterface
    public  interface ClickListener {
        //추상 메소드
        void onClick();
    }

    private ClickListener clickListener;

    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public void click() {
        this.clickListener.onClick();
    }
}