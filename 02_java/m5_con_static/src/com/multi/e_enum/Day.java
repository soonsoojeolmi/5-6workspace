package com.multi.e_enum;

public enum Day {
//    SUNDAY, MONDAY, TUESDAY,
//    WENDNESDAY, THURSDAY, FRIDAY,SATURDAY;
//


    MONDAY("월요일"),
    TUESDAY("화요일"),
    FRIDAY("금요일");

    private final String koreanDay; // 한글 요일 이름 필드

    // 생성자
    Day(String koreanDay) {
        this.koreanDay = koreanDay;
    }

    // Getter 메서드 추가
    public String getKoreanDay() {
        return koreanDay;
    }
}

