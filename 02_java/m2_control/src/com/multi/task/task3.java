package com.multi.task;

import java.util.Calendar;

public class task3 {
    public static void main(String[] args) {
                Calendar calendar = Calendar.getInstance();


                int year = calendar.get(Calendar.YEAR);
                if (year >= 2000) {
                    System.out.println("밀레니엄 세대시군요.");
                } else {
                    System.out.println("밀레니엄 세대가 아니시군요.");
                }


                int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
                if (dayOfWeek == Calendar.SATURDAY || dayOfWeek == Calendar.SUNDAY) {
                    System.out.println("쉬~~~~~~~~~자");
                } else {
                    System.out.println("열~~심히 공부하자");
                }

                // 3) 달 확인
                int month = calendar.get(Calendar.MONTH) + 1;
                switch (month) {
                    case 2:
                        System.out.println("2월은 28일까지");
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        System.out.println(month + "월은 30일까지");
                        break;
                    default:
                        System.out.println(month + "월은 31일까지");
                        break;
                }
            }
        }