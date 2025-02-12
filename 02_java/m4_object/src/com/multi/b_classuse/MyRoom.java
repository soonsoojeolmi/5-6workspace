package com.multi.b_classuse;

import com.multi.a_classmake.*;

public class MyRoom {
    public static void main(String[] args) {
        Phone p1 = new Phone();
//        p1.speaker = "애플"; //set
//        p1.size = 10;

        System.out.println(p1);
//        System.out.println(p1.speaker);
//        System.out.println(p1.size);

        p1.setSize(-10);
        p1.setSpeaker("애플");
        System.out.println(p1.getSize());
        System.out.println(p1.getSpeaker());


        p1.makeCall();
        p1.takephoto();

        Phone p2  = new Phone();
        p2.setSize(100);
        p2.setSpeaker("삼성");
        System.out.println(p2);

        System.out.println(p2.getSize());
        System.out.println(p2.getSpeaker());

        Dog dog = new Dog();

        dog.setColor("흰색");
        dog.setKind("사모예드");

        System.out.println(dog.getColor());
        System.out.println(dog.getKind());


        //TV 클래스 만들기 // 채널 볼륨 //on off
        //tv 객체 2개만들기
        TV tv1 = new TV();
        tv1.on();

        TV tv2 = new TV();
        tv2.off();

        System.out.println(tv2);
        System.out.println(tv2.toString());

        Calculator  cal =new Calculator();
        cal.add();
        cal.minus();

        MethodPrinter m1 = new MethodPrinter();
        m1.methodA();
    }
}
