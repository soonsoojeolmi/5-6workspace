package com.multi.a_basic;

public class PrintTest2 {

    public static void main(String[] args) {
        //System.out.printf("포맷", 출력하고자하는 값, 값, ...);
        // 출력하고자 하는 값들이 제시된 포맷(형식)에 맞춰서 출력만 진행 --> 한줄띄어쓰기는 안함
        // %d : 정수
        // %c : 문자
        // %s : 문자열 또는 문자도 가능
        // %f : 실수

	/*   \t : 정해진 공간만큼 띄어쓰기
		 \n : 출력하고 다음라인으로 옮김

		 정렬방법
			%5d : 5칸을 확보하고 오른쪽 정렬
			%-5d : 5칸을 확보하고 왼쪽 정렬
			%.2f : 소수점 아래 2자리까지만 표시



            sout + tab => System.out.println()

            souf + tab => System.out.printf("")
	*/

        int iNum1 = 10;
        int iNum2 = 20;

        System.out.printf("%d\n", iNum1);// 10
        System.out.printf("%d\n", iNum1 , iNum2);// 10
        //System.out.printf("%d %d \n", iNum1);--에러발생 : 두번째 포맷에 들어갈 값이 없어서
        System.out.printf("%d %d \n", iNum1 , iNum2);


        System.out.printf("%d + %d = %d\n", iNum1 , iNum2, iNum1+iNum2);
        System.out.printf("%5d\n",iNum1);//5칸 공간띄우고 오른쪽(음수면 왼쪽)

        float fNum = 1.2345458f;
        double dNum = 4.53;

        System.out.printf("%f\t%f\n", fNum, dNum);//%f - 실수 값을 소수점 아래 6자리 까지 보여줌
        // 넘어가게되면 반올림, 소수점 아래 값없으면 0으로 채움

        System.out.printf("%.3f\t%.3f\n", fNum, dNum);//소수점 셋재짜리까지


        char ch = 'a';
        String str = "Hello";

        System.out.printf("%c %s\n", ch , str);//a Hello
        System.out.printf("%c %s\n", ch , ch);//a a --> %s 는 char 형도 가능

        System.out.printf("%C %S\n", ch , str);//대문자로


        int value = 123;
        System.out.printf("상품의 가격:%d원\n", value);
        System.out.printf("상품의 가격:%6d원\n", value);
        System.out.printf("상품의 가격:%-6d원\n", value);
        System.out.printf("상품의 가격:%06d원\n", value);

        double area = 3.14159 * 10 * 10;
        System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", 10, area);

        String name = "홍길동";
        String job = "도적";
        System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
    }
}
