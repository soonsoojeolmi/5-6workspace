package com.multi.task;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("몸무게 입력(kg): ");
        double weight = scanner.nextDouble();

        System.out.print("신장 입력(m): ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);
        System.out.println("BMI 값: " + bmi);


        double currentPoints = 3000;
        double additionalPoints = 33.3;
        double totalPoints = currentPoints + additionalPoints;

        System.out.println("\n현재까지의 누적 포인트: " + currentPoints);
        System.out.println("추가 포인트: " + additionalPoints);
        System.out.println("최종 포인트는 " + totalPoints);

        scanner.close();
    }
}
