package com.multi.task;

public class Array02 {
    public static void main(String[] args) {
        double[] array02 = new double[300];
        array02[0]= 10.1;
        array02[1]= 20.2;
        array02[2]= 30.2;
        array02[299]= 50.5;

        for(int i=0;i<array02.length;i++){
            System.out.println(array02[i]);
        }
    }
}
