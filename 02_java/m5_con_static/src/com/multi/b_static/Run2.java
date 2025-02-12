package com.multi.b_static;

import com.multi.a_constructor.Computer;

public class Run2 {
    public static void main(String[] args) {

        FieldTest f1 = new FieldTest();
        f1.test(20);

        //FieldTest2 f2 = new FieldTest();
        System.out.println(FieldTest2.NUM);//static이기 때문에 객체 생성없이 바로 호출 클래스명으로 작성

        NonStaticMethod test = new NonStaticMethod();
        test.method1();

        String str = test.method2();
        System.out.println(str);

        //반드시 전달되는 값의 순서와 타입 개수가 일치해야 함
        test.method3(10,20);

        int result = test.method4(10,20);
        System.out.println(result);

        //--------------------------------------------------------
        //static 예약어가 붙어서 객체 생성 없이 클래스명:메소드명(전달값) 호출
        System.out.println(StaticMethod.num);

        StaticMethod.method1();
        System.out.println(StaticMethod.method2());
        StaticMethod.method3("제니");
        System.out.println(StaticMethod.method4("리사"));

        //------------------------------------------
        Computer c1 = new Computer();

        int result1 =  c1.sum(1,2,3);
        System.out.println(result1);

        int result2 = c1.sum(1,2,3,4,5);
        System.out.println(result2);

        int[] arr ={1,2,3,4,5};
        int result3 = c1.sum(arr);
        System.out.println(result3);
    }
}
