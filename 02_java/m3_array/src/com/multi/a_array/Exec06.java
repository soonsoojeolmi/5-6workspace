package com.multi.a_array;

import java.util.Arrays;

public class Exec06 {
    public static void main(String[] args) {
        /* 다차원 배열
         * 다차원 배열은 2차원 이상의 배열을 의미한다.
         * 배열의 인덱스마다 또 다른 배열의 주소를 보관하는 배열을 의미한다.
         * 즉, 2차원 배열은 1차원 배열 여러 개를 하나로 묶어서 관리하는 배열을 의미한다.
         * 더 많은 차원의 배열을 사용할 수 있지만 일반적으로 2차원 배열보다 더 높은 차원의 배열은 사용 빈도가 현저히 적다. (인지 범위 초과)
         *  */

        /* 2차원 배열을 사용하는 방법
         * 1. 배열의 주소를 보관할 레퍼런스 변수 선언(stack)
         * 2. 여러 개의 1차원 배열의 주소를 관리하는 배열을 생성(heap)
         * 3. 각 인덱스에서 관리하는 배열을 할당(heap)하여 주소를 보관하는 배열에 저장
         * 4. 생성한 여러 개의 1차원 배열에 차례로 접근해서 사용
         * */

        int[][] iarr = new  int[6][];
        int iarr2[][] = new int[6][];
        int[] iarr3[] = new int[6][];

        int[] iarr4[] = new int [3][5];

        for(int i  = 0 ; i < iarr4[0].length; i++){
            System.out.println(iarr4[0][i]+" ");
        }

        for(int i = 0; i<iarr4.length ; i++){
            for(int j = 0; j < iarr4[i].length; j++){
                System.out.println(iarr4[i][j]+ " ");
            }
        }
        //자료형[][] 변수명 = new 자료형[할당할 배열의 갯수][할당할 배열의 길이];

        //정변배열
        int[][] iarr5 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
        for(int i = 0; i<iarr5.length ; i++){
            for(int j = 0; j < iarr5[i].length; j++){
                System.out.print(iarr5[i][j]+ " ");
            }
            System.out.println();
        }

        //가변배열
        int[][] iarr6 = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}};
        for(int i = 0; i<iarr6.length ; i++){
            for(int j = 0; j < iarr6[i].length; j++){
                System.out.print(iarr6[i][j]+ " ");
            }
            System.out.println();
        }

        int[][] original = {{1, 2}, {3, 4}};
        int[][] copy = original.clone();

        copy[0][0] = 10;
        System.out.println(Arrays.deepToString(original)); // [[10, 2], [3, 4]]
        System.out.println(Arrays.deepToString(copy));     // [[10, 2], [3, 4]]
//깊은복사
        System.out.println("original: " + original);
        System.out.println("copy: " + copy);
//얕은복사
        System.out.println("original: " + original[1]);
        System.out.println("copy: " + copy[1]);
        System.out.println(copy == original);
    }


}
