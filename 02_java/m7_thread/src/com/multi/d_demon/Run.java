package com.multi.d_demon;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        AutoSaveThread autoSaveThread = new AutoSaveThread();

        autoSaveThread.setDaemon(true);
        //데몬스레드로 지정 .setDaemon(true);

        Thread.sleep(10000);

        System.out.println("메인스레드종료");
    }
}
