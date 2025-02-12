package com.multi.a_array;

import javax.swing.*;
import java.util.Random;

public class Exec01 {
    public static void main(String[] args) {
        int[] jumsu =  new int[1000];

        System.out.println(jumsu);//jvm이 자동으로 변수, toString() 호출해서 주소값이 출력되는 것
        System.out.println(jumsu.toString());

        jumsu[0]=100;
        jumsu[10]=999;
        jumsu[999]=1000;

        System.out.println("첫번째 값: " + jumsu[0]);
        System.out.println("11번째 값: " + jumsu[10]);
        System.out.println("마지막 값: " + jumsu[999]);
        System.out.println("500번째 값: " + jumsu[499]);

        System.out.println(jumsu.length);
        System.out.println(jumsu[jumsu.length-1]);

        /* 기본적으로 배열을 선언하고 할당하게 되면
         * 배열의 각 인덱스에는 자바에서 지정한 기본값으로 초기화가 된 상태가 된다.
         * heap영역은 값이 없는 빈 공간이 존재할 수 없다.
         * */

        /* 값의 형태 별 기본값
         * 정수 : 0
         * 실수 : 0.0
         * 논리 : false
         * 문자 : \u0000
         * 참조 : null
         * */

        char[] c =new char[100];
        System.out.println(c);

        c[0]='A';
        c[1]='b';
        System.out.println(c[1]);
        System.out.println(c);//보통은 배열의 해시코드(주소값) 이 출력되지만 char 배열은 무자가 출력되도록 내부적으로 실행됨

        //로또 만들기
        //공간 6개를 만들자
        //랜덤한 45개값을 넣어주자
        int[] lotto = new int[6];

        Random random = new Random();

        for(int i=0;i<lotto.length;i++){
            lotto[i]= random.nextInt(45)+1;
        }

        for(int i : lotto){
            System.out.println(i+ " ");
        }

        //만들고자 하는 배열의 크기와 값이 정해져 있다면 {} 안에 값을 넣어서 선언과 동시에 초기화해ㅜㄴ다
        int[] scores = {100, 20, 90};
        int sum = 0;
        double avg = 0;
        int avg_sum = 0;

        //배열 항목의 총합 구하기
        for(int i=0; i<scores.length;i++){
            sum += scores[i];
        }
        System.out.println(sum);

        //배열 항목의 평균 구하기
        for(int i = 0 ; i<scores.length ; i++){
            avg_sum += scores[i];
        }
        avg = (double)avg_sum/scores.length;
        System.out.println(avg);

        /* 랜덤한 카드를 한 장 뽑아서 출력해보자 */
        /* 먼저 모양과 카드 숫자별로 값을 저장할 두 종류의 배열을 만들자 */
        String[] shapes = {"SPADE", "CLOVER", "HEART", "DIAMOND"};
        String[] cardNumbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE"};

        Random random1 = new Random();
        int randomShape = random1.nextInt(shapes.length);
        int randomCardNumber = random1.nextInt(cardNumbers.length);

        System.out.println("당신이 뽑은 카드는 " + shapes[randomShape]
                + " " + cardNumbers[randomCardNumber] + " 카드 입니다.");

        //dialog로 정수로  점수 5개를 입력 받아서
        //합출력

        int[] jumsu1  =  new int[5];
        for(int i =0 ; i < jumsu1.length ; i++){
            String data = JOptionPane.showInputDialog("점수입력");
            jumsu1[i] = Integer.parseInt(data);
        }
        int sum1 = 0;
        for(int i = 0; i< jumsu1.length ;i++){
            sum1 += jumsu1[i];
        }
        System.out.println("총합 : "+sum1);

        //100개의 공간에 100까지의 숫자중 랜덤한 값을 넣어  80보다 큰값 갯수 출력
        int[] num = new int[1000];

        for(int i = 0; i<  num.length ; i++){
            num[i]  = random1.nextInt((100));
        }
        int count=0;
        for(int n : num){
            if(n > 80){
                count++;
            }
        }

        System.out.println(count);

    }
}
