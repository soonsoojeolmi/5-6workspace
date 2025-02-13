package com.multi.c_sync.exec02;

public class Run {
    public static void main(String[] args) {

        //notify()는 대기 중인 다른 스레드를 깨워 실행 가능하도록 만든다.wait()는 현재 스레드를 일시 정지하여 다른 스레드가 실행되도록 한다.
        Work workObject = new Work(); // 공유 객체 생성

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                workObject.methodA();  // 스레드가 methodA를 수행
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                workObject.methodB();  // 스레드가 methodB를 수행
            }
        });

        t1.start();
        t2.start();
    }
}
