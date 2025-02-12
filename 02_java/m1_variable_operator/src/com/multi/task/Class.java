package com.multi.task;

import java.util.Scanner;

public class Class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("오늘은 무슨 요일인가요?");
        String day = sc.nextLine();

        System.out.println("수업 끝나고 무엇을 하실 예정인가요?");
        String plan = sc.nextLine();

        String result = "오늘 "+day+"에 수업 후 나는 "+plan+"할 예정";

        System.out.println("처리한 내용을 출력해 주세요.");
        System.out.println(result);

        System.out.println("num1의 값을 입력해주세요.");
        int num1 = sc.nextInt();

        System.out.println("num2의 값을 입력해주세요.");
        int num2 = sc.nextInt();

        System.out.println("두 수를 더한 값은 얼마? "+(num1+num2));
        System.out.println("num1에서 num2를 나누면 얼마?"+(num1/num2));
        System.out.println("num1에서 num2를 나누면 나머지는 얼마?"+(num1%num2));

        sc.close();
    }
}
