package com.multi.c_add.dto;

public class MemberDTO {

    private int number;           //회원번호
    private String name;          //회원명
    private int age;             //나이
    private char gender;          //성별
    private double height;        //키
    private double weight;        //몸무게
    private boolean isActivated;    // 회원탈퇴여부 (활성화여부)

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isActivated() {
        return isActivated;
    }

    public void setActivated(boolean activated) {
        isActivated = activated;
    }


    @Override
    public String toString() {
        return "MemberDTO{"+
                "number = " + number+
                ", name='" + name + '\''+
                ", age=" + age +
                ", gender=" + gender +
                ", height=" + height +
                ", weight=" + weight +
                ", isActivated=" + isActivated +
                '}';
    }


    /*
     * 설정자(setter) 작성 규칙
     * : 필드값을 변경할 목적의 매개변수를 변경하려는 필드와 같은 자료형으로 선언하고
     *   호출 당시 전달되는 매개변수의 값을 이용하여 필드의 값을 변경한다.
     *
     * [표현식]
     * public void set필드명(매개변수) {
     *     필드 = 매개변수;
     * }
     *
     * [작성예시]
     * public void setName(String name) {
     *     this.name = name;
     * }
     *
     * 접근자(getter) 작성 규칙
     * : 필드의 값을 반환받을 목적의 메소드 집함을 의미한다.
     *   각 접근자는 하나의 필드에만 접근하도록 한다.
     *   필드에 접근해서 기록된 값을 return을 이용하여 반환하며, 이 때 반환타입은 반환하려는 값의 자료형과 일치시킨다.
     *
     * [표현식]
     * public 반환형 get필드명() {
     *     return 반환값;
     * }
     *
     * [작성예시]
     * public String getName() {
     *     return this.name;
     * }
     */


}
