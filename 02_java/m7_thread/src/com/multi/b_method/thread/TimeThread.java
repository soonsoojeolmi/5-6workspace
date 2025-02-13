package com.multi.b_method.thread;

import java.util.Date; // Date 클래스를 명시적으로 임포트

public class TimeThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {

            Date date = new Date();
            System.out.println("시작 >> " + date);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
