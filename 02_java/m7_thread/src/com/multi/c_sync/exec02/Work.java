package com.multi.c_sync.exec02;

public class Work {
    public synchronized void methodA() {
        System.out.println(Thread.currentThread().getName() + " : methodA 실행");
        notify();  //  // 대기 중인 다른 스레드를 깨움
        try {
            wait();  // 현재 스레드를 일시 정지
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void methodB() {
        System.out.println(Thread.currentThread().getName() + " : methodB 실행");
        notify();   // 대기 중인 다른 스레드를 깨움
        try {
            wait();  // 현재 스레드를 일시 정지
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
