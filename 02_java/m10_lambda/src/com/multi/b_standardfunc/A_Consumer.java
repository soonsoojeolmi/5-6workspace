package com.multi.b_standardfunc;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

public class A_Consumer {
     /*
*  Consumer<T> - accpet(T t) : 파라미터 있고 리턴값없는  CASE
*   - Consumer 함수적 인터페이스는 리턴값이 없는 accept() 메소드를 가지고 있다.
*   - accept() 메소드는 단지 매개값을 소비하는 역활을한다. (사용만하고 리턴값이 없다.)
*   @param <T> the type of the input to the operation
           void accept(T t)
*
*/
    public void method01(){
        Consumer<String> consumer1 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        Consumer<String> consumer2 = (String str) -> System.out.println(str);

        consumer2.accept("consumer test1");
        consumer1.andThen(consumer2).accept("consumer test2");//하나의 매개값으로 2번 이어서 사용

        /*
Consumer 에서 파생된 인터페이스
BiConsumer :  파라미터 2개
DoubleConsumer : double타입의 파라미터
IntConsumer : int타입의 파라미터
LongConsumer : long타입의 파라미터
ObjDoubleConsumer : 두개의 파라미터중에 하나는 obj 다른하나는 double
ObjIntConsumer : 두개의 파라미터중에 하나는 obj 다른하나는 int
ObjLongConsumer : 두개의 파라미터중에 하나는 obj 다른하나는 long

      */

        BiConsumer<String, String> biConsumer= (String str1, String str2) -> {
            System.out.println(str1+str2);
        };

        biConsumer.accept("BiConsumer", "두개 매개값 받아서 소비");

        DoubleConsumer doubleConsumer = (val)  -> {
            System.out.println(val);
        };
        doubleConsumer.accept(0.002);
    }
}
