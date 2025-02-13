package com.multi.a_thread.thread;

public class Thread3 implements Runnable{
    @Override
    public void run(){
        // 우선순위가 그나마 적용되게 하기위한 delay 코드
        for(int i = 0 ; i < Integer.MAX_VALUE; i++) {

            for(int j = 0; j < Integer.MAX_VALUE; j++) {

            }
        }

        System.out.println(Thread.currentThread().getName());
    }
}
