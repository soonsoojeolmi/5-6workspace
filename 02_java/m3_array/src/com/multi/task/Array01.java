package com.multi.task;

public class Array01 {
    public static void main(String[] args) {
        int[] array01 = new int[200];
        array01[0]= 1000;
        array01[1]= 2000;
        array01[2]= 3000;
        array01[199]= 5000;

        for(int i=0;i<array01.length;i++){
            System.out.println(array01[i]);
        }
    }
}
