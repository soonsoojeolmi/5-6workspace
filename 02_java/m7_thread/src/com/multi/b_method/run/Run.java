package com.multi.b_method.run;

import com.multi.b_method.thread.CountThread;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        CountThread countThread = new CountThread();
        countThread.start();

        Scanner sc= new Scanner(System.in);
        System.out.println("아무값이나 입력하세요");
        String input = sc.nextLine();

        System.out.println("입력한  값 "+ input);

        countThread.interrupt();//Thread.sleep(), wait(), join() 등 대기 상태(sleep, wait, join)인 경우 interrupt()가 호출되면 InterruptedException이 발생
    }
}
