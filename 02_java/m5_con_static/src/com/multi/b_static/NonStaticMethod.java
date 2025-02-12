package com.multi.b_static;

import com.multi.a_constructor.Account;

public class NonStaticMethod {
    // 메소드
    /*
     * [접근제한자] [예약어] 반환할값의자료형 메소드명([자료형 매개변수명, 자료형 매개변수명, ...]) {
     *     수행내용;
     *     [return 반환값;]
     * }
     */
//매개변수의 유무와 반환값 유무에 따른 구분

    //매개변수가 없고 반환값도 없는 메소드
    public void method1(){
        System.out.println("매개변수가 없고, 반환값도 텂는 메소드");
    }

    //매개변수가 없고 반환값이 없는 메소드
    public String method2(){
        return "매개변수가 없고 반환값이 없는 메소드";
    }

    //매개변수가 있고, 반환값이 없는 경우

    public void method3(int num1, int num2){
        System.out.println(num1 - num2);
    }

    //매개변수 있고, 반환값도 있는 경구
    public int method4(int num1, int num2){
        return num1+num2;
    }

    //매개변수로 객체도 전달받을 수 있음, 타입
    public void method(Account a1){
        a1.toString();
    }

    //public void updateMember(MemberDTO member){
       // member.setName("리사");
    //}

}
