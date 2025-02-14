package com.multi.collection.c_generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Exec03 {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        List<Double> integerList2 = new ArrayList<>();
        integerList2.add(1.1);
        integerList2.add(2.1);
        integerList2.add(3.1);

        printNum(integerList2);
        printNum(integerList);
    }
    public static void printNum(List<? extends Number> numbers){
        for(Number n :numbers){
            System.out.println(n);
        }
    }

    //문자열만 받을 수 있는 모든 컬렉션 타입을 허용하는 메서드
    public static void printColl(Collection<String> str) {
        for (String s : str) {
            System.out.println(s);
        }
    }
}
