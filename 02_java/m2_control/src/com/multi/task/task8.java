package com.multi.task;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int iu = 0, bts = 0, newjeans = 0;
        while (true) {
            System.out.println("1) 아이유  2) 방탄  3) 뉴진스  4) 종료 >> ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                iu++;
            } else if (choice == 2) {
                bts++;
            } else if (choice == 3) {
                newjeans++;
            } else if (choice == 4) {
                break;
            } else {
                System.out.println("잘못된 입력입니다. 1~4 사이의 숫자를 입력하세요.");
            }
        }

        System.out.println("시스템을 종료합니다.");
        System.out.println("-----------------");
        System.out.println("아이유: " + iu + "표");
        System.out.println("방탄: " + bts + "표");
        System.out.println("뉴진스: " + newjeans + "표");

        scanner.close();
    }
}
