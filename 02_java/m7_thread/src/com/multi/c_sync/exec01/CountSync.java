package com.multi.c_sync.exec01;

public class CountSync {
    //synchronized 키워드를 사용하면 메서드 전체를 하나의 스레드만 실행할 수 있도록 잠금을 걸어주고 하나의 쓰레드가 실행을 완료하기 전까지 다른 쓰레드는 해당 메서드에 접근할수 없다

    private int count = 0;

    public synchronized void increment(){
        System.out.println(Thread.currentThread().getName());
        count++;
    }

    public synchronized int getCount(){
        return count;
    }

}
