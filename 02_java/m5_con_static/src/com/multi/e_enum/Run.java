package com.multi.e_enum;

public class Run {
    public static void main(String[] args) {
        //enum클래스는 상수 필드를 관리, enum 클래스 명
        //static final 으로 자동으로 선언
        //열거형, 상수값 이외의값은 할당이 안됨

        //enum Day {MONDAY, TUESDAY,FRIDAY}

        Day today = Day.FRIDAY;

        switch(today){
            case MONDAY :
                break;
            case FRIDAY :
                System.out.println("금요일");
                break;

        }

        for(Day day  :  Day.values()){
            System.out.println(day);
        }

        Day day = Day.valueOf("MONDAY");
        System.out.println(day);

        System.out.println(today.getKoreanDay());//파라미터로 전달되는 문자열과 같은  상수 반환
        System.out.println(today.name());
        System.out.println(today.ordinal());//선언한 순서의 인덱스
    }
}
