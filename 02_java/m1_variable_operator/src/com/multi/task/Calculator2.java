package com.multi.task;

public class Calculator2 {
    public static void main(String[] args) {
        int coffeeCount = 5;
        int coffeePrice = 5000;
        int totalPrice = coffeeCount * coffeePrice;

        System.out.println("총 커피값: " + totalPrice + "원");

        if (totalPrice > 20000) {
            System.out.println("할인해드릴게요.");
        } else {
            System.out.println("총 커피값을 내세요.");
        }

        // 문제 2: 나이 계산
        int currentAge = 100;
        int nextYearAge = currentAge + 1;

        System.out.println("내 내년 나이: " + nextYearAge);

        if (nextYearAge > 100) {
            System.out.println("이제부터 시작");
        } else {
            System.out.println("아직 젊어요");
        }
    }
}