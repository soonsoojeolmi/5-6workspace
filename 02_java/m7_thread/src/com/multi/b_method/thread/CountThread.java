package com.multi.b_method.thread;

public class CountThread extends Thread{

    @Override
    public void run() {
        for(int i = 20; i>= 0 ;i--){
            System.out.println("카운트 "+i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                //throw new RuntimeException(e);
                e.printStackTrace();
                i = -1;
            }
        }
    }
}
