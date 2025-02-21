package com.multi.task;

import java.util.Calendar;

public class task4 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();


        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        if (hour < 11) {
            System.out.println("굿모닝");
        } else if (hour < 15) {
            System.out.println("굿애프터눈");
        } else if (hour < 19) {
            System.out.println("굿이브닝");
        } else {
            System.out.println("굿나잇");
        }

        int month = calendar.get(Calendar.MONTH) + 1;
        switch (month) {
            case 2:
                System.out.println("2월은 28일까지");
                break;
            case 4:
            case 6:
            case 7:
            case 11:
                System.out.println(month + "월은 30일까지");
                break;
            default:
                System.out.println(month + "월은 31일까지");
                break;
        }
    }
}