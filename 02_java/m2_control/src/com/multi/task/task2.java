package com.multi.task;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("오늘 날짜의 끝자리를 입력하세요: ");
        int date = scanner.nextInt();

        if (date == 1) {
            System.out.println("아이스크림 할인 받는 날!");
        } else {
            System.out.println("할인 없음.");
        }

        System.out.print("\n검사번호를 입력하세요: ");
        int testNumber = scanner.nextInt();
        int firstDigit = testNumber / 1000;
        int secondDigit = (testNumber / 100) % 10;

        if (firstDigit >= 1 && firstDigit <= 4) {
            System.out.println("1번 건물");
        } else if (firstDigit >= 5 && firstDigit <= 8) {
            System.out.println("2번 건물");
        }

        switch (secondDigit) {
            case 1:
                System.out.println("1번 검사실");
                break;
            case 2:
                System.out.println("2번 검사실");
                break;
            case 3:
                System.out.println("3번 검사실");
                break;
            case 4:
                System.out.println("4번 검사실");
                break;
            default:
                System.out.println("잘못된 검사번호입니다.");
                break;
        }


        System.out.print("\n당신이 지금 하고 싶은 일을 입력하세요: ");
        String activity = scanner.next();

        switch (activity) {
            case "운동":
                System.out.println("헬스장으로 가세요!");
                break;
            case "식사":
                System.out.println("음식점으로 가세요!");
                break;
            case "휴식":
                System.out.println("집으로 가세요!");
                break;
            case "공부":
                System.out.println("학원으로 가세요!");
                break;
            default:
                System.out.println("유효하지 않은 입력입니다.");
        }

        scanner.close();
    }

}