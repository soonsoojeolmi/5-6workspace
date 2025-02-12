package com.multi.c_add;

public class OverloadingTest {
    public void test(){}

    //public void test(){}

    public void test(int a){}

    public void test(int a, String b){}

    public void test(String a, int b){}

    public void test(int  a, int b){}

    //public void test(int c, int d){} //매개변수 명 상관없이 타입이  위랑 같아서 사용 불가

    public void  test(int a, int b, String c){}

    //public void test(int a, int b, String c){return 0;} //반환형도 상관 없음

    //private public void  test(int a, int b, String c){}//접근제한자도 상관 없음
}
