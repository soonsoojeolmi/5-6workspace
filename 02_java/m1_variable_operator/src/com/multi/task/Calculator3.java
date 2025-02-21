package com.multi.task;

public class Calculator3 {
    public class CalculationTest2 {
        public static void main(String[] args) {
            int waterPrice = 1000;
            int waterCount = 2;
            int maskPrice = 2000;
            int maskCount = 3;

            int totalWaterPrice = waterPrice * waterCount;
            int totalMaskPrice = maskPrice * maskCount;
            int totalAmount = totalWaterPrice + totalMaskPrice;

            System.out.println("1) 생수값 금액: " + totalWaterPrice + "원");
            System.out.println("2) 마스크값 금액: " + totalMaskPrice + "원");
            System.out.println("3) 총 지불금액: " + totalAmount + "원");

            for (int i = 0; i < 1000; i++) {
                System.out.println("나는 짱");
            }

            int koreanScore = 75;
            int mathScore = 50;

            int totalScore = koreanScore + mathScore;
            double averageScore = totalScore / 2.0;

            System.out.println("국어 + 수학 총합: " + totalScore);
            System.out.println("국어 + 수학 평균: " + averageScore);
        }
    }
}
