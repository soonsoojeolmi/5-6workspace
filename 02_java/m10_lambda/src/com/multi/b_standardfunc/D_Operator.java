package com.multi.b_standardfunc;

import com.uni.lambda.b_lambda.b_standard_func.dto.Student;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

public class D_Operator {
    /*
     * Operator<T> - 파라미터있고 리턴값있는 CASE
     *   - Operator 함수적 인터페이스는 매개값과 리턴값이 있는 applyXXX() 메소드를 가지고 있다.
     *   - Function 함수적 인터페이스와 다르게 주로 매개값을 이용해서 연산하고 동일한 타입으로 결과를 리턴하는 역할을 한다.
     */

    /*
 ( 모두 데이터타입 동일 )
  BinaryOperator<T> : BiFunction<T,U,R>  상속 : 두개의 파라미터 전달하고 반환
  UnaryOperator<T> : Function<T,R> 상속 : 하나의 파라미터 전달하고 반환
  DoubleBinaryOperator : 두개의 파라미터 double 전달하고  double 반환
  DoubleUnaryOperator     :    : 하나의 파라미터 double 전달하고 double반환
  IntBinaryOperator : 두개의 파라미터 int 전달하고  int 반환
  IntUnaryOperator    :    : 하나의 파라미터 int 전달하고 int반환
  LongBinaryOperator : 두개의 파라미터 long 전달하고  long 반환
  LongUnaryOperator   :    : 하나의 파라미터 long 전달하고 long반환
 */


    public void method1(){
        BinaryOperator<String> bo  = new BinaryOperator<String>() {
            @Override
            public String apply(String s1, String s2) {
                return s1.length() == s2.length() ? "길이가 같음 ":s1.length()>s2.length() ? s1 : s2;
            }
        };

        String str1 = "lambda";
        String str2 = "java17";
        String str3 = "test";

        String result1 = bo.apply(str1, str2);
        System.out.println(result1);

        String result2 = bo.apply(str1, str3);
        System.out.println(result2);

        IntBinaryOperator intBinaryOperator = (a, b) -> a+b;
        IntUnaryOperator intUnaryOperator = a ->  a*a;
        System.out.println(intBinaryOperator.applyAsInt(3, 4));
        System.out.println(intUnaryOperator.applyAsInt(3));

        Student student1 = new Student("김원중", 20, "M", 80, 90);
        Student student2 = new Student("구승민", 22, "M", 90, 80);

        //더 높은 수학점수 학생 객체 리턴
        //객체 가져와서 비교
//        BinaryOperator<Student> compare = (s1, s2) -> s1.getMath() >= s2.getMath() ? s1 : s2;
//
//        Student topMathStudent = compare.apply(student1, student2);
//        System.out.println("수학 점수가 더 높은 학생: " + topMathStudent.getName());

        BinaryOperator<Student> binaryOperator = (Student s1, Student s2) -> {
            if (s1.getMath() > s2.getMath()) {
                return s1;
            } else {
                return s2;
            }
        };

        System.out.println(binaryOperator.apply(student1, student2));

        binaryOperator = BinaryOperator.maxBy((s3, s4) -> Integer.compare(s3.getMath(), s4.getMath()));

        System.out.println(binaryOperator.apply(student1, student2));
    }
}
