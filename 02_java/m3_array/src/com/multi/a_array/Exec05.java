package com.multi.a_array;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Exec05 {
    public static void main(String[] args) {
        int math1= 80;
        int math2=math1;
        System.out.println(math1);
        System.out.println(math2);
        math2 = 90;

        System.out.println(math1);
        System.out.println(math2);

        int[] n1={100, 200,300};
        int[] n2 =n1;

        System.out.println(n1);
        System.out.println(n2);

        n2[0]=500;

        System.out.println(n1[0]);
        System.out.println(n2[0]);
        System.out.println(n1 == n2);

        System.out.println(Arrays.toString(n1));
        System.out.println(Arrays.toString(n2));

        //경로복사
        int[] n3 = n1.clone(); // 깊은 복사

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n1 == n3); // 주소값비교

        n3[0] = 100;

        System.out.println(Arrays.toString(n1));
        System.out.println(Arrays.toString(n3));

        //system.arraycopy()를위한 복사
        //System.arraycopy()를 이용한 복사 System.arraycopy(복사할 배열, 복사를 시작할 인덱스, 복사받을 배열, 붙여넣기를 시작할 인덱스, 복사할 길이 );

        int [] n4 = new int[n1.length];
        System.arraycopy(n1, 0, n4,0, n1.length);

        System.out.println(Arrays.toString(n1));
        System.out.println(Arrays.toString(n4));

        System.out.println(n1 == n4);

        n4[0] = 900;

        System.out.println(Arrays.toString(n1));
        System.out.println(Arrays.toString(n4));

        //Array.copyOf()

        int[] n5 = Arrays.copyOf(n1, n1.length);

        System.out.println(n1);
        System.out.println(n5);

        System.out.println(n1 == n5);


        //깊은복사
/* 1. for문을 이용한 동일한 인덱스의 값 복사

 -1 차원일떄깊은복사, 다차원일때는 얕은복사
 * 2. Object의 clone()을 이용한 복사
 * 3. System의 arraycopy()를 이용한 복사
 * 4. Arrays의 copyOf()를 이용한 복사*/
    }
}
