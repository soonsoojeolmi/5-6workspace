package com.multi.a_array;

public class Exec02 {
    public static void main(String[] args) {
        //배열은 일반적으로 같은 타입을 묶을 때 사용!
        //다양한 타입을 묶을 때는 배열을 쓰지 않음.!
        //배열은 고정된 크기를 가진다.(크기 조절 불가능)

        String[] family = {"아버지","어머니", "형", "나", "동생"};
        int[] age = { 100, 88, 33, 24, 10};
        double[] height = { 177.5, 152.2, 190.3, 167.7, 155.3};

        System.out.println("우리집 식구 정리");
        System.out.println("------------------");
        System.out.println("이름\t나이\t키");
        System.out.println("------------------");
        for (int i = 0; i < height.length; i++) {
            System.out.println(family[i] + "\t" + age[i] + "\t" + height[i]);
        }
    }
}
