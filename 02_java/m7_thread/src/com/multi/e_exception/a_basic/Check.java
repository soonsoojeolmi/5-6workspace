package com.multi.e_exception.a_basic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Check {
    //CheckedException 은 반드시 예외처리를 해줘야한다.
// 조건문, 소스 코드의 수정으로 해결이 안된다. -- 예측불가
// 주로 외부 매개체의 입출력시 발생
    public void method01() throws IOException {
        method02();
    }

    private void method02() throws IOException {
        byte[ ] aa  ={'a', 'b', 'c'};
        /*1. try~ catch()처리 : 이구문에서 바로 예외를 처리하겠다.
         *
         * try :  예외가 발생할 가능성이있는 코드를 블록내에 작성
         * catch (발생될예외클래스 매개변수): try 구문에서 예외가 발생하면 어떻게 처리를 할것인지 작성
         * finally : try~catch 문 수행후 반드시 꼭 실행되어야 하는 코드를 작성
         *
         * */
//        try{
//            System.out.write(aa);
//        }catch (IOException e){
//            e.printStackTrace();
//        }

        //2.throws  :지금 이 메소드에서 예외를 처리하지않고 현재 이 메소드를 호출한 곳으로 위임함
        System.out.write(aa);
    }

    public void method03(){
        // try ~ with ~ resource :  반납할 close자원 이 있는경우 처리 -> try () 괄호 안에 객체 생성할수 있고
//이 괄호안에서 생성한 객체는 close 해주지않아도 자동 close 된다.

//        BufferedReader br = null;
//
//        try {
//            br = new BufferedReader(new FileReader(""));
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }finally{
//            if (br != null) {
//                try {
//                    br.close();
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }

        try(BufferedReader br = new BufferedReader(new FileReader(""))){
        }catch(FileNotFoundException e){
            throw new RuntimeException(e);
        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }
}
