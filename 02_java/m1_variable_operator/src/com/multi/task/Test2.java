package com.multi.task;

public class Test2 {
    public static void main(String[] args) {

        String name = "abc"; //0이 1번째 자리
        char aChar = name.charAt(0);//"a"
        char bChar = name.charAt(1);//"b"
        System.out.println(aChar + " " + bChar);

        char pwd_r = 'p';
        char pwd_e = 'q';
        if (pwd_r != pwd_e) {
            System.out.println("재입력!");
        } else {
            System.out.println("PASS!");
        }


        double wChange = 2.2;
        if (wChange > 2) {
            System.out.println("다이어트 성공");
        } else {
            System.out.println("다이어트 실패");
        }

        if ((pwd_r == pwd_e) && (wChange > 2)) {
            System.out.println("오늘은 성공!");
        } else {
            System.out.println("내일 다시 도전");
        }
    }
}