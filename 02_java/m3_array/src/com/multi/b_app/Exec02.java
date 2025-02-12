package com.multi.b_app;

import java.util.Scanner;

/**
 * packageName    : com.multi.b_app
 * fileName       : Exec02
 * author         : uni
 * date           : 2025-02-05
 * description    : 간단한 좌석 예약 시스템
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-02-05        uni       최초 생성
 */
public class Exec02 {
    public static void main(String[] args) {
        /** 간단한 좌석 예약 시스템
         * 사용자가 원하는 좌석 번호를 입력하여 예약을 진행할 수 있으며, 모든 좌석의 예약 상태를 확인할 수 있다.
         */

        // 1. 좌석 배열 초기화 (0: 빈 좌석, 1: 예약된 좌석)
        int[] seats = new int[10]; // 총 10개의 좌석 (0~9)
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // 2. 현재 좌석 상태 출력
            System.out.println("-----------------------------");
            System.out.print(" ");
            for (int i = 0; i < seats.length; i++) {
                System.out.print(i + "  ");
            }
            System.out.println("\n-----------------------------");

            for (int seat : seats) {
                System.out.print(seat + "  ");
            }
            System.out.println(); // 줄바꿈

            // 3. 사용자 입력 받기
            System.out.print("원하는 좌석 입력(종료 -1)>> ");
            int seatNumber = scanner.nextInt();

            // 4. 종료 조건 (-1 입력 시 종료)
            if (seatNumber == -1) {
                System.out.println("프로그램 종료!");
                break;
            }

            // 5. 좌석 예약 처리
            if (seatNumber < 0 || seatNumber >= seats.length) {
                System.out.println("잘못된 좌석 번호입니다. 다시 입력해주세요.");
            } else if (seats[seatNumber] == 1) {
                System.out.println("이미 예약된 좌석입니다. 다른 좌석을 선택해주세요.");
            } else {
                seats[seatNumber] = 1; // 예약 완료
                System.out.println("예약을 완료했습니다.");
            }
        }

        scanner.close(); // 리소스 해제

//        int maxVote = 0;
//        StringBuffer winner = new StringBuffer();
//        for (int i = 0; i < member.length; i++) {
//            if(vote[i] > maxVote){
//                maxVote = vote[i];
//
//                winner.setLength(0);
//                winner.append(member[i]);
//
//            }else if(vote[i] == maxVote){
//                winner.append(",").append(member[i]); // 메소드 체이닝
//            }
//
////        }
    }
}
