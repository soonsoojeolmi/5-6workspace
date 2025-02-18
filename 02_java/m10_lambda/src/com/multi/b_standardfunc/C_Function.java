package com.multi.b_standardfunc;

import com.uni.lambda.b_lambda.b_standard_func.dto.Student;

import java.util.function.Function;
import java.util.function.ToIntFunction;

public class C_Function {
    /*
 *  Function<T, R> - apply(T t) : 파라미터 있고 리턴값있는 CASE
 *   - Function 함수적 인터페이스는 매개값과 리턴값이 있는 applyXXX() 메소드를 가지고 있다.
 *   - 주로 매개값을 리턴값으로 매핑(타입 변환)하는 역활을 한다.
 *
       @param <T> the type of the input to the function
       @param <R> the type of the result of the function

        R apply(T t) 구현
   */

    public void method1() {
        //익명 구현
        Function<String, Integer> func1 = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };

        String str = "Lambda";
        int r = func1.apply(str);

        System.out.println("lambda의 길이" + str);

        //람다구현
        Function<String, Integer> func2 = s -> s.length();

        r = func1.apply(str);

        System.out.println("람다식 lambda의길이 " + r);

        Function<Integer, Integer> func3 = val -> val + 10000;

        r = func3.apply(10);

        System.out.println(r);

//public Student(String name, int age, String gender, int math, int english)
        Student student = new Student("김원중", 10, "M", 80, 70);

        Function<Student, String> func4 = new Function<Student, String>() {
            @Override
            public String apply(Student student) {
                return student.getName();
            }
        };

        System.out.println(func4.apply(student));

        //람다식 나이
        Function<Student, Integer> func5 = s -> s.getAge();

        System.out.println(func5.apply(student));

        /*
Function 에서 파생된 인터페이스
BiFunction<T,U,R> : T와 U 전달하고 R타입으로 반환
DoubleFunction<R> : double로 전달하고 R타입으로 반환
IntFunction<R> : int로 전달하고 R타입으로 반환
IntToDoubleFunction : int로 전달하고 double타입으로 반환
IntToLongFunction : int로 전달하고 long타입으로 반환
LongToDoubleFunction : long로 전달하고 double타입으로 반환
LongToIntFunction : long로 전달하고 int타입으로 반환
ToDoubleBiFunction<T, U> : 객체 T와 U를 double로 반환
ToDoubleFunction : 객체 T를 double로 반환
ToIntBiFunction<T, U> : 객체 T와 U를 int로 반환
ToIntFunction   : 객체 T를 int로 반환
ToLongBiFunction<T, U>: 객체 T와 U를 long으로 매핑
ToLongFunction : 객체 T를 long으로 반환
  */

        System.out.println("수학접수");
        println(s -> s.getMath(), student);

        System.out.println("영어점수");
        println(s -> s.getEnglish(), student);
    }

    public void println(ToIntFunction<Student> function, Student student){
        System.out.println(function.applyAsInt(student));
    }
}

