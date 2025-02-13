package com.uni.a_thread.e_practice;

import java.util.Random;

public class CarRacing {

    public CarRacing() {
        System.out.println("자동차 경주 시작!");

        // 각 자동차 스레드 시작
        Car car1 = new Car("Car1");
        Car car2 = new Car("Car2");
        Car car3 = new Car("Car3");

        car1.start();
        car2.start();
        car3.start();

        // 모든 자동차 경주가 끝날 때까지 대기
        try {
            car1.join();
            car2.join();
            car3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\n자동차 경주가 종료되었습니다!");
    }

    // 내부 클래스
    public class Car extends Thread {

        private int x;      // 현재 위치
        private final String name;  // 자동차 이름

        public Car(String name) {
            this.name = name;
            this.x = 0; // 초기 위치
        }

        @Override
        public void run() {
            Random random = new Random();
            for (int i = 0; i < 20; i++) {  // 20번 이동
                int move = random.nextInt(5);  // 0~4만큼 전진
                x += move;

                // 경주 상황 출력
                displayRace();

                try {
                    Thread.sleep(300);  // 0.3초 대기 후 다음 이동
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        private synchronized void displayRace() {
            // 콘솔에 자동차 경주 상황을 표시
            StringBuilder raceTrack = new StringBuilder();
            raceTrack.append(name).append(": ");  // 자동차 이름 표시

            // 현재 위치까지 * 표시
            for (int i = 0; i < x; i++) {
                raceTrack.append("*");
            }
            System.out.println(raceTrack); // 콘솔에 출력
        }
    }

    public static void main(String[] args) {
        new CarRacing();
    }
}
