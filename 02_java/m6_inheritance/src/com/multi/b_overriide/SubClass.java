package com.multi.b_overriide;

public class SubClass extends SuperClass{

    //Override시 메소드 이름 변경하면 에러남
    //          메소드 리턴 타입 변경시 에러
    //          메소드 시그니처 변경시 에러

    @Override
    public void method(int num) {
        super.method(num);
    }

    //*4.private 메소드는 접근이불가능하기 때문에 오버라이딩이불가능하다.
//    @Override
//    private void privateMethod(int num) {}

    //*5.final 키워드가 사용된 메소드는 오버라이딩이 불가능하다.
    //    @Override
//    public final void finalMethod(){}

    //*6.접근제한자는 부모 메소드와 같거나 더 넓은 범위여야 한다.
//    @Override
//    void protectedMethod() {//더 좁은 범위여서 불가능
//        super.protectedMethod();
//    }

//    @Override
//    protected void protectedMethod() {//같은  범위여서 가능
//        super.protectedMethod();
//    }

    @Override
    protected void protectedMethod() {//더 넓은범위여서 가능
        super.protectedMethod();
    }
}
