package com.multi.collection.c_generic;

import java.util.ArrayList;
import java.util.List;

public class Exec02 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();

        list1.add(10);
        list1.add(10);

        List<String> list2 = new ArrayList<>();

        list2.add("제니");
        list2.add("리사");

        printList(list1);
        printList(list2);
    }

    public static void printList(List<?> list){
        for(Object o :list){
            System.out.println(o);
        }
    }
}
