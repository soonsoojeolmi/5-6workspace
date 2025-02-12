package com.multi.a_constructor;

public class Computer {

//    public int sum(int a, int b, int c);
//    public int sum(int a, int b, int c, int d, int f);

    public int sum(int...values){
        int sum = 0;
        for(int i=0 ; i<values.length; i++){
            sum +=values[i];
        }

        return sum;
    }
}
