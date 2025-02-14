package com.multi.collection.c_generic;

public class GenericTest <T>{
    /* 제네릭 설정은 클래스 선언부 마지막 부분에 다이아몬드 연산자를 이용하여 작성하게 된다.
 * 다이아몬드 연산자 내부에 작성하는 영문자는 관례상 대문자로 작성한다.
 * 제네릭을 컴파일할 때, 제네릭 타입 정보를 제거하고 일반 타입(주로 Object 타입)으로 변환된다
    런타임에는 제네릭 타입 정보가 유지되지 않으며, 컴파일 시점에서만 타입 체크된다.
    */

    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }

    //a.compare(b)

    public boolean compare(GenericTest<T> other) {
        return value.equals(other.value);
    }
}
