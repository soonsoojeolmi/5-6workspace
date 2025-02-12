package com.multi.b_app;

import java.util.Random;

public class Exec03 {
    public static void main(String[] args) {
        // 1. 답안지와 대답 공간 생성 (990개)
        int[] answerSheet = new int[990];  // 정답지 배열
        int[] answer = new int[990];       // 사용자의 대답 배열

        // 2. 랜덤 숫자 생성기 생성
        Random random = new Random();

        // 3. while문을 사용하여 1~4 범위의 숫자를 랜덤으로 생성하여 배열에 저장
        int i = 0;
        while (i < 990) {
            answerSheet[i] = random.nextInt(4) + 1; // 1~4 사이의 숫자
            answer[i] = random.nextInt(4) + 1;      // 1~4 사이의 숫자
            i++;
        }

        // 4. while문을 사용하여 정답 비교 및 점수 계산
        int score = 0;
        i = 0; // i를 다시 0으로 초기화
        while (i < 990) {
            if (answerSheet[i] == answer[i]) {
                score++; // 정답이면 점수 증가
            }
            i++;
        }

        // 5. 최종 점수 출력
        System.out.println("총 점수: " + score + " / 990");
    }
}
