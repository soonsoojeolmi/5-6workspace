package com.multi.e_exception.a_basic;

public class Run {
    // - 시스템 에러 : 컴퓨터의 오작동으로 발생하는 에러 --> 소스코드로 해결안됨 --> 심각한 에러
// - 컴파일 에러 : 소스코드 문법상 오류 --> 빨간줄로 애초에 오류 알려줌 (매번 컴파일이 진행되고 있기 때문에 컴파일시 문제가 있는 것들을 미리 알려준다)
// - 런타임 에러 : 코드 상으로는 문제가 없는데 프로그램 실행할 때 발생하는 에러 (사용자의 실수 일 수도 있고 개발자가 예측 가능 한 경우를 제대로 처리 안 해 놓은걸 수도 있다)
    public static void main(String[] args) {
//        Uncheck uncheck = new Uncheck();
//        uncheck.method03();

        Check check = new Check();
//        try{
//            check.method01();
//        }catch (IOException e){
//            throw new RuntimeException(e);
//        }

        check.method03();
    }
}
