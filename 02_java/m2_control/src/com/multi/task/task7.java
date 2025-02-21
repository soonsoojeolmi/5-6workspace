package com.multi.task;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("시작값 입력: ");
        int start = sc.nextInt();
        System.out.print("종료값 입력: ");
        int end = sc.nextInt();

        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }

        System.out.println("총 합: " + sum);

        System.out.print("시작값 입력: ");
        start = sc.nextInt();
        System.out.print("종료값 입력: ");
        end = sc.nextInt();
        System.out.print("점프값 입력: ");
        int step = sc.nextInt();

        sum = 0;
        for (int i = start; i <= end; i += step) {
            sum += i;
            if (sum > 100) {
                System.out.println("더한 값이 100을 넘어 프로그램 종료");
                break;
            }
        }

        System.out.println("최종 더한 값: " + sum);

        sc.close();
    }
}
