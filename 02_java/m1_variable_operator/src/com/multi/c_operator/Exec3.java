package com.multi.c_operator;

public class Exec3 {
    public static void main(String[] args) {
        //논리 연산자
        /*
         *  && : 두 개의 조건이 모두 true 여야 결과값이 true이다. (AND)
         *
         *  true && true    => true
         *  true && false   => false
         *  false && true   => false
         *  false && false  => false
         *
         *  --> && 연산자를 기준으로 앞의 결과가 false값이 나온다면 뒤의 조건은 굳이 실행하지 않는다.
         *
         *  || : 두 개의 조건이 하나라도 true라면 결과값이 true이다. (OR)
         *
         *  true || true    => true
         *  true || false   => true
         *  false || true   => true
         *  false || false  => false
         *
         * --> || 연산자를 기준으으로 앞의 결과가 true가 나온다면 뒤의 조건은 굳이 실행하지 않는다.
         */
        //단축 평가 계산(Short-circuit Evaluation)

        int num =10;
        System.out.println(num);

    }
}
