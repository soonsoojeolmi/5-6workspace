package com.multi.d_app3;

public class Run {
    public static void main(String[] args) {
        Human human = new Human(32, "김원중");

        Woman woman = new Woman(24, "닝닝", "만두");

        WonderWoman wonderwoman = new WonderWoman(24,"안유진", "케이크", true);

        Man man = new Man(33, "구승민", 22);

        SuperMan superman =  new SuperMan(39, "전준우", 8, true);
    }
}
