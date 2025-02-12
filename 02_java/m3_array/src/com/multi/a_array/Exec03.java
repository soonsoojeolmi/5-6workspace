package com.multi.a_array;

import java.util.Arrays;

public class Exec03 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println(num1);
        System.out.println(num2);

        int[] arr ={2, 1, 3};

        int temp2;
        temp2 = arr[0];
        arr[0] = arr[1];
        arr[1] = temp2;

        System.out.println(Arrays.toString(arr));

        //최소값  구하기
        int[] num ={55, 22, 11, 99, 33};

        int min = num[0];

        for(int i = 0 ; i<num.length ; i++){
            if(min >  num[i]){
                min = num[i];
            }
        }
        System.out.println(min);

        int max = num[0];
        for(int i=0;i<num.length;i++){
            if(max < num[i]){
                max = num[i];
            }
        }
        System.out.println(max);

        int count = 0;
        for(int i =0 ;i<num.length;i++){
            if(num[i]==max){
                System.out.println("MAX의 위치 "+i);
                count++;
            }
        }
        System.out.println("MAX의 개수 "+count);

        //정렬
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

        //내림차순 정렬
        for(int i = 0; i< num.length/2 ; i++){
            int temp1 = num[i];
            num[i] = num[num.length-1 -i];
            num[num.length -1 -i] = temp1;
        }

        System.out.println("내림차순 정렬 : "+Arrays.toString(num));

        String s1 = "감자,  고구마, 양파";
        String[] sArr = s1.split(",");
        System.out.println(Arrays.toString(sArr));
    }
}
