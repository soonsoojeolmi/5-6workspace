package com.multi.collection.b_detail.map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Run {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        treeMap.put("a", 10);
        treeMap.put("b", 20);
        treeMap.put("d", 40);
        treeMap.put("h", 50);
        treeMap.put("f", 20);
        treeMap.put("k", 60);

        Set<Map.Entry<String, Integer>> entrySet = treeMap.entrySet();


        for (Map.Entry<String, Integer> e : entrySet) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }
    }
}