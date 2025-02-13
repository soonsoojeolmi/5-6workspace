package com.multi.b_method.thread;

public class ImageThread extends Thread {
    @Override
    public void run() {
        String[] list = {"1.png", "2.png", "3.png", "4.png", "5.png"};

        for (String image : list) {
            System.out.println("이미지 === " + image);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
