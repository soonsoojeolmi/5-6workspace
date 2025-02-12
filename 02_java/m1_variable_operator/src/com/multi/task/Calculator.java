package com.multi.task;

public class Calculator {
    public static void main(String[] args) {
        int gym = 66;
        int math = 77;
        int eng = 88;
        int kor = 99;
        double avg = ((gym+math+eng+kor)/4) ;

        System.out.println("점수의 평균은 ? "+avg);

        double pi = 3.14;
        double radius = 2.2;
        double circle = pi * radius *  radius;

        System.out.println("원의 면적은 : "+circle);
    }

}
