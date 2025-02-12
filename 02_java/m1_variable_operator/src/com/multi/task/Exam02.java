package com.multi.task;

public class Exam02 {
    public static void main(String[] args) {
        double height = 199.9;
        String weight = String.valueOf((height-100)*0.9);
        double idealweight = Double.parseDouble(weight);

        System.out.println("적정 체중 : "+idealweight+"kg");
    }
}
