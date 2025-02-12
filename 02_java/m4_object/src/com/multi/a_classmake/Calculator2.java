package com.multi.a_classmake;

public class Calculator2 {

    public int add(int x, int y){
        //x, y 파라메터, 지역변수,매개변수
        //지역 변수는  초기화를 꼭 해줘야 한다.그래서 값을 받아와서 사용
        //지역변수는 이 블럭 안에ㅓ만 사용 가능
        return x+y;
    }
    public int minus(int x, int y){
        return x-y;
    }
    public int mul(int x, int y){
        return x*y;
    }
    //오버로딩, 메소드명이 통일하고 시그니처(매개변수의 타입, 순서, 개수)다르게 정의 한 것
    //div(double x, int y) ->시그니처
    public void div(double x, int y){
        System.out.println("나누기 "+(x/y));
    }
    public void div(int x, int y){
        System.out.println("나누기 "+(x/y));
    }
    public void add(){System.out.println("더하기");}
    public void minus(){System.out.println("빼기");}
    public void mul(){System.out.println("곱하기");}
    public void div(){System.out.println("나누기");}
}
