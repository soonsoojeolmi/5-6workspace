package com.multi.c_add.carracer;

import java.util.Scanner;

public class CarRacer {
    private Car car = new Car();

    public void startUp(){
        car.startUp();
    }

    public void stopAccelator(){
        car.go();
    }

    public void stopBreak(){
        car.stop();
    }

    public void turnOff(){
        car.turnOff();
    }

    public static void main(String[] args) {
        CarRacer racer = new CarRacer();
        Scanner sc=  new Scanner(System.in);

        while(true){
            System.out.println("======= 카레이싱 프로그램 ========");
            System.out.println("1. 시동걸기");
            System.out.println("2. 전진");
            System.out.println("3. 정지");
            System.out.println("4. 시동 끄기");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴 선택 : ");

            int no = sc.nextInt();

            switch(no) {
                case 1:
                    racer.startUp();
                    break;
                case 2:
                    racer.stopAccelator();
                    break;
                case 3:
                    racer.stopBreak();
                    break;
                case 4:
                    racer.turnOff();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    return;

                default:
                    System.out.println("잘못 선택하였습니다.");
                    break;
            }
            }
    }
}
