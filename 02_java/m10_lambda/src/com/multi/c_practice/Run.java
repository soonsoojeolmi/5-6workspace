package com.multi.c_practice;

public class Run {
    public static void main(String[] args) {
        Button button = new Button();

        button.setClickListener(() -> {
            System.out.println("OK 버튼이 클릭되었습니다.");
        });

        button.click();

        Button cbutton = new Button();

        button.setClickListener(() -> {
            System.out.println("OK 버튼이 클릭되었습니다.");
        });

        cbutton.click();
    }
}
