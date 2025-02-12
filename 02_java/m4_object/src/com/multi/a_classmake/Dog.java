package com.multi.a_classmake;

public class Dog {
    //색, 종류

    //멤버변수
    private String color;
    private String kind;

    //멤버 메소드
    public void bark(){
        System.out.println("강아지가 멍멍짖다");
    }

    public void wagTail(){
        System.out.println("꼬리를 흔들다");
    }

    //setter / getter 메소드

    public void setColor(String color) {
        this.color = color;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getColor() {
        return this.color;
    }

    public String getKind() {
        return this.kind;
    }

}
