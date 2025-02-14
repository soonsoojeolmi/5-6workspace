package com.multi.collection.b_detail.set;

import java.util.TreeSet;

public class Run {
    public static void main(String[] args) {
        TreeSet<Integer> scores  = new TreeSet<>();

        scores.add(87);
        scores.add(90);
        scores.add(75);
        scores.add(98);
        scores.add(80);

        for(Integer s: scores){
            System.out.println(s);
        }

        //특정 Integer 객체를 가져오기
        System.out.println("가장 낮은 점수: " + scores.first());
        System.out.println("가장 높은 점수: " + scores.last());
        System.out.println("95점 아래 점수: " + scores.lower(95));
        System.out.println("95점 위의 점수: " + scores.higher(95));
        System.out.println("95점 이거나 바로 아래 점수: " + scores.floor(95));
        System.out.println("85점 이거나 바로 위의 점수: " + scores.ceiling(85) + "\n");
    }
}
