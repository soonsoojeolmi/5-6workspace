package com.multi.b_standardfunc;

import com.uni.lambda.b_lambda.b_standard_func.dto.Student;

import java.util.function.Predicate;

public class E_Predicate {
    /*
     * Predicate<T> test(T t) - 파라미터 있고 리턴값(boolean) 있는 CASE
     *   - Predicate 함수적 인터페이스는 매개변수와 boolean 리턴값이 있는 testXXX() 메소드를 가지고있다.
     *   - 이 메소드들은 매개값을 조사해서 true/false를 리턴하는 역활을 한다.
     *
     */

    public void method1() {
        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() > 5;
            }
        };
        System.out.println(predicate.test("lambda"));

        predicate =  val -> val.length() > 5;

        System.out.println(predicate.test("lambda"));

        Predicate<Integer> predicate2 = val -> val >1000;
        Predicate<Integer> predicate3 = val -> val >10;

        boolean result3 = predicate2.and(predicate3).test(5);
        System.out.println(result3);

        Predicate<Student> predicat4 = student -> student.getGender().equals("M");


//        System.out.println("김원중은 남자입니가?"+predicate.test(student1)); // true
//        System.out.println("구승민은 남자입니가?"+predicate.test(student2)); // false
    }
}