package com.multi;

import com.multi.a_basic.functional.B_Functional;
import com.multi.b_standardfunc.*;

public class Run {
    public static void main(String[] args) {
//        new A_Lambda().method1();

        B_Functional bFunctional = new B_Functional();
        //bFunctional.method1();
//        bFunctional.method2();
//        bFunctional.method3();

        A_Consumer aConsumer = new A_Consumer();
//        aConsumer.method01();

        B_Supplier bSupplier = new B_Supplier();
//        bSupplier.method1();

        C_Function cFunction = new C_Function();
//        cFunction.method1();

        D_Operator dOperator = new D_Operator();
//        dOperator.method1();

//        new E_Predicate E_Predicate ePredicate = new E_Predicate();
//        ePredicate.method1();
    }
}
