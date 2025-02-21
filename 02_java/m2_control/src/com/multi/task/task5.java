package com.multi.task;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자1 입력>> ");
        int num1 = sc.nextInt();
        System.out.print("숫자2 입력>> ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("앞 숫자가 크다.");
        } else if (num1 < num2) {
            System.out.println("뒤 숫자가 크다.");
        } else {
            System.out.println("두 숫자가 같다.");
        }


        System.out.print("당신이 좋아하는 과목은>> ");
        String subject = sc.next();

        switch (subject.toLowerCase()) {
            case "java":
                System.out.println("JSP로 점프");
                break;
            case "python":
                System.out.println("장고로 점프");
                break;
            default:
                System.out.println("무조건 열심히!!");
                break;
        }

        sc.close();
    }

}