package com.multi.collection.c_generic;

import java.util.ArrayList;
import java.util.List;

//<?> : 와일드카드, 모든 타입을 허용
//<? extends T> : T와 T의 하위 타입만 허용 (읽기 전용)
//<? super T> : T와 T의 상위 타입만 허용 (쓰기 가능)

public class Exec04 {
    public static void main(String[] args) {
        List<Integer> list1 =  new ArrayList<>();
        List<Integer> list2 =  new ArrayList<>();

        addNumber(list1);
        addNumber(list2);
        //addNumber(list3);
    }

    //List의 Integer  , Number 타입만 허용하는 메소드
    public static void addNumber(List<? super Integer> list){
        list.add(10);
        list.add(20);
        System.out.println(list);
    }
}
