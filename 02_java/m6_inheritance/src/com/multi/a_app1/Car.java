package com.multi.a_app1;

public class Car {
    private boolean  isRunning;

    public Car(){
        System.out.println("Car의 기본생성자");
    }

    public void run(){
        isRunning = true;
        System.out.println("자동차가 달립니다.");
    }

    public void soundHorn(){
        if(isRunning){
            System.out.println("빵빵");
        }else{
            System.out.println("주행중이 아닙니다.");
        }
    }

    public void stop(){
        isRunning = false;
        System.out.println("자동차가 멈춥니다.");
    }

    public boolean isRunning(){
        return isRunning;
    }
}
