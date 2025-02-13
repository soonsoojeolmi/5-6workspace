package com.multi.c_sync.exec01;

public class Run {
    public static void main(String[] args) throws InterruptedException {

        //동기화 : 여러 작업을 순서대로 처리 가능 방식 : 속도는 느림,  정확도는 좋음
        //비동기화 : 여러 작업을 동시에 처리 가능 방식 :속도는 빠름, 정확도는 떨어짐

        Count count = new Count();//비동기 방식

        Thread t1 = new Thread(()->{
            for(int i = 0; i< 100000 ; i++){
                count.increment();
            }
        });

        Thread t2 = new Thread(()->{
            for(int i = 0; i< 100000 ; i++){
                count.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();//t1, t2 메소드가 끝날 때까지 메인 스레드를 대기

        System.out.println(count.getCount());
    }
}
