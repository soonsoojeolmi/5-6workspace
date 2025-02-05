package com.multi.c_operator;

public class Exec02 {
    public static void main(String[] args) {
        // 비교연산자(==, !=, >, >=)
// *** 비교 결과가 중요(논리형 데이터!! true/false)
//- ‘==‘과 ‘!=‘은 모든 자료형에 사용 가능
//- ‘==‘과 ‘!=‘을 제외한 비교 연산자(>, >=, <, <=)는 기본형 boolean과 참조형(String)을 제외하고 나머지 자료형에 모두 사용 가능
        int x = 200;
        int y = 100;
        System.out.println("일치? " + (x == y));
        System.out.println("불일치? " + (x != y));
        System.out.println("이상? " + (x >= y));
        System.out.println("초과? " + (x > y));

        String a="이효리";//리터럴 방식
        String b="유재석";

        String c=new String(" 이효리");//새로운 객체를 생성
        String d ="이효리";

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());

        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));
        System.out.println(System.identityHashCode(c));
        System.out.println(System.identityHashCode(d));

        System.out.println(a == b);//주소값  비교
        System.out.println(a == c);
        System.out.println(a == d);

        System.out.println(a.equals(c));//값비교
        System.out.println(a.equals(d));
    }
}
