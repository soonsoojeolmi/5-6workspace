package com.multi.b_static;

public class FieldTest2 {
    /*
     *
     *
     *  static - 공유의 개념
     *  final - 한번 지정된 값 변경 X
     *
     *  static final - 반드시 선언과 동시에 값 초기화 해야됨
     *  왜냐면 static 키워드가 붙은 변수는 전부 static 영역에 저장되기 때문에
     *
     *  프로그램 시작시 값이 저장되면 더이상 변경되지 않고 공유하면서 사용할 목적으로 사용된다.
     *
     *  * 상수 필드
     *
     *  public 접근제한자에 static과 final 예약어를 함께 사용하는 것을 상수필드라고 한다.
     *  static final 순서 상관 없음
     */

    //public static final int NUM;//상수 필드는 무조건 초기화
    public static final int NUM =1 ;//setter, getter 메소드 필요 없음

    /******final-마지막의, 변경될수 없는
     final class : 상속에 사용하지 못하는 클래스, 후손 클래스 파생 못 함
     final method : 상속시 오버라이딩 하지 못하는 메소드
     final variable : 변수가 가진 초기값 수정 불가능(상수로만듬)
     final field : 필드가 가진 초기값 수정 불가능(상수로만듬)
     */


}
